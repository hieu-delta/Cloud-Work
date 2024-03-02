// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Arrays;
// import java.util.Scanner;

// class college implements Comparable<college>{
//     String id, name, clasid, email;
//     college(String id, String name, String classid, String email){
//         this.id = id;
//         this.name = modify(name);
//         this.clasid = classid;
//         this.email = email;
//     }

//     String modify (String s){
//         s = s.trim();
//         s = s.toUpperCase();
//         String temp[] = s.split("\\s+"), tmp="";
//         for (String i : temp)
//             tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
//         return tmp.trim();
//     }

//     public String toString(){
//         return id + " " + name + " " + clasid + "\n" + email;
//     }

//     public int compareTo (college sv){
//         return this.id.compareTo(sv.id);
//     }
// }

// public class J07033 {
//     public static void main(String[] args) throws FileNotFoundException {
//         Scanner in = new Scanner(new File("SINHVIEN.in.txt"));
//         int n = Integer.valueOf(in.nextLine());
//         college sv[] = new college[n];
//         for (int i=0; i<n; i++){
//             String id = in.nextLine();
//             String name = in.nextLine();
//             String classid = in.nextLine();
//             String email = in.nextLine();
//             sv[i] = new college(id, name, classid, email);
//         }
//         Arrays.sort(sv);
//         for (college i : sv)
//             System.out.println(i);
//     }
// }
