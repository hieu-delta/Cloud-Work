// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.io.ObjectInputStream;
// import java.util.ArrayList;

// public class J07006 {
//     public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//         ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
//         ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
//         int check[] = new int[1001];
//         for (Integer i : a)
//             check[i]++;
//         for (int i=0; i<1000; i++)
//             if (check[i]> 0)
//                 System.out.println(i + " " + check[i]);
//         in.close();
//     }
// }
