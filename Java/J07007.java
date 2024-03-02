import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class WordSet {
    String[] s = new String[10001];
    int d=0;
    WordSet (String str) throws FileNotFoundException{
        Scanner in = new Scanner(new File(str));
        while(in.hasNext()==true){
            s[d] = in.next().toLowerCase();
            d++;
        }
        Arrays.sort(s,0,d);
    }

    public String toString() {
        String temp="";
        for (int i=0; i<d; i++)
            if (s[i].equals(s[i+1])==false)
                temp+=s[i]+"\n";
        return temp;
    }
}

public class J07007 {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
