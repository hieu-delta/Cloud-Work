package Others;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Scanner;

// class SinhVienPtit implements Comparable<SinhVienPtit>{
//     String id, name, class_id, email, phone, leader, project;

//     SinhVienPtit (String id, String name, String class_id, String email, String phone){
//         this.id = id;
//         this.name = name;
//         this.class_id = class_id;
//         this.email = email;
//         this.phone = "0" + phone;
//     }

//     public int compareTo (SinhVienPtit x){
//         return this.id.compareTo(x.id);
//     }

//     public String toString (){
//         return id + " " + name + " " + leader + " " + project + " " + phone;
//     }
// }

// public class huong_dan_do_an_tot_nghiep {
//     public static void main(String[] args) throws FileNotFoundException {
//         Scanner in = new Scanner(new File("DANHSACH.in.txt"));
//         ArrayList<SinhVienPtit> a = new ArrayList<SinhVienPtit>();
//         while(in.hasNextLine()){
//             String id = in.nextLine();
//             String name = in.nextLine();
//             String class_id = in.nextLine();
//             String email = in.nextLine();
//             String phone = in.nextLine();
//             SinhVienPtit ptiter = new SinhVienPtit(id, name, class_id, email, phone);
//             a.add(ptiter);
//         }

//         Scanner sc = new Scanner(new File("HUONGDAN.in.txt"));
//         int n = Integer.valueOf(sc.nextLine());
//         for (int i=0; i<n; i++){
//             String temp = sc.nextLine();
//             String leader = temp.substring(0, temp.length()-1).trim();
//             int number = temp.charAt(temp.length()-1)-48;
//             for (int j=0; j<number; j++){
//                 String tmp = sc.nextLine();
//                 String id = tmp.substring(0, 10);
//                 for (int x=0; x<a.size(); x++)
//                     if (id.equals(a.get(x).id)){
//                         a.get(x).leader = leader;
//                         a.get(x).project = tmp.substring(11).trim();
//                     }
//             }
//         }
//         Collections.sort(a);
//         for (SinhVienPtit i : a)
//             System.out.println(i);
//     }
// }