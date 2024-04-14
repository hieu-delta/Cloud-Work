import os
import pandas as pd
from androguard.misc import AnalyzeAPK
from gensim.models.doc2vec import Doc2Vec, TaggedDocument
from nltk.tokenize import word_tokenize
from nltk.corpus import stopwords
from nltk.stem import WordNetLemmatizer
import logging
import nltk

# Setup logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')

# Ensure nltk resources are downloaded
nltk.download('punkt')
nltk.download('wordnet')
nltk.download('stopwords')

# Load stop words and prepare preprocessing functions
english_stopwords = set(stopwords.words('english'))
# Adding custom stopwords
custom_stopwords = {'activity', 'service', 'android', 'intent', 'application'}
english_stopwords.update(custom_stopwords)

lemmatizer = WordNetLemmatizer()


def preprocess(text):
    # Tokenize and convert to lower case
    words = word_tokenize(text.lower())
    # Remove stop words and apply lemmatization, only keep alphanumeric words
    filtered_words = [lemmatizer.lemmatize(w) for w in words if w.isalnum() and not w in english_stopwords]
    return filtered_words


def extract_features_from_apk(apk_path):
    try:
        a, d, dx = AnalyzeAPK(apk_path)
        permissions = a.get_permissions()
        activities = a.get_activities()
        services = a.get_services()
        receivers = a.get_receivers()

        # Xử lý EncodedMethod trong api_calls
        api_calls = []
        for method in dx.find_methods():
            try:
                api_calls.append(method.get_method())
            except AttributeError:
                # Xử lý trường hợp EncodedMethod không có phương thức get_method()
                pass

        # Chuyển các dữ liệu không phải chuỗi thành chuỗi
        permissions = [str(p) for p in permissions]
        activities = [str(a) for a in activities]
        services = [str(s) for s in services]
        receivers = [str(r) for r in receivers]
        api_calls = [str(ac) for ac in api_calls]

        # Kết hợp tất cả các đặc trưng thành một chuỗi văn bản
        all_features = ' '.join(permissions + activities + services + receivers + api_calls)
        return all_features
    except Exception as e:
        logging.error(f"Error processing APK file: {apk_path}. Error: {str(e)}")
        return None


def prepare_data_for_doc2vec(directory_path, label):
    data = []
    for apk_file in os.listdir(directory_path):
        if apk_file.endswith(".apk"):
            apk_path = os.path.join(directory_path, apk_file)
            features_text = extract_features_from_apk(apk_path)
            if features_text is not None:
                # Apply preprocessing
                tokens = preprocess(features_text)
                data.append(TaggedDocument(words=tokens, tags=[label]))
    return data


def train_doc2vec_model(data):
    model = Doc2Vec(vector_size=50, window=5, min_count=2, workers=4, epochs=40)
    model.build_vocab(data)
    model.train(data, total_examples=model.corpus_count, epochs=model.epochs)
    return model


def save_features_to_csv(model, data, filename):
    # Prepare data for DataFrame
    df_data = []
    for document in data:
        vector = model.infer_vector(document.words)
        df_data.append(vector.tolist() + [document.tags[0]])

    # Create DataFrame and save to CSV
    columns = [f"feature_{i + 1}" for i in range(len(df_data[0]) - 1)] + ['label']
    df = pd.DataFrame(df_data, columns=columns)
    df.to_csv(filename, index=False)


# Path to the directories
malware_dir = './10_malware'
benign_dir = './10_benign'

# Prepare data and train the model
malware_data = prepare_data_for_doc2vec(malware_dir, 'MALWARE')
benign_data = prepare_data_for_doc2vec(benign_dir, 'BENIGN')
all_data = malware_data + benign_data
doc2vec_model = train_doc2vec_model(all_data)

# Save the model and feature vectors to CSV
doc2vec_model.save("apk_doc2vec_model.model")
save_features_to_csv(doc2vec_model, all_data, 'feature_vectors.csv')
