// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// class Xinhvien {
//     String name, id, classid, birth, gpa;
//     static int d=1;
//     Xinhvien (String name, String classid, String birth, Float gpa){
//         this.name = name;
//         this.classid = classid;
//         id = "B20DCCN" + String.format("%03d", d++);
//         this.birth = modify(birth);
//         this.gpa = String.format("%.2f", gpa);
//         //this.gpa = gpa;
//     }

//     String modify (String birth){
//         String temp, s[] = birth.split("/");
//         temp = String.format("%02d", Integer.valueOf(s[0]))+"/"+String.format("%02d", Integer.valueOf(s[1]))+"/"+s[2];
//         return temp;
//     }

//     public String toString(){
//         return id + " " + name + " " + classid + " " + birth +" " + gpa;
//     }
// }

// public class J07010 {
//     public static void main(String[] args) throws FileNotFoundException {
//         Scanner in = new Scanner(new File("SV.in"));
//         int n = Integer.valueOf(in.nextLine());
//         for (int i=1; i<=n; i++){
//             String name = in.nextLine();
//             String classid = in.nextLine();
//             String birth = in.nextLine();
//             Float gpa = Float.valueOf(in.nextLine());
//             Xinhvien st = new Xinhvien (name, classid, birth, gpa);
//             System.out.println(st);
//         }
//     }
// }