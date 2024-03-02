// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Arrays;
// import java.util.Scanner;

// class sanPham implements Comparable<sanPham>{
//     String id, name, price, warranty;
//     sanPham (String id, String name, String price, String warranty){
//         this.id = id;
//         this.name = name;
//         this.price = price;
//         this.warranty = warranty;
//     }

//     public int compareTo (sanPham x){
//         int price_check = Integer.compare(Integer.valueOf(this.price), Integer.valueOf(x.price));
//         if (price_check != 0)
//             return -price_check;
//         return this.id.compareTo(x.id);
//     }

//     public String toString(){
//         return id + " " + name + " " + price + " " + warranty;
//     }
// }

// public class J07047 {
//     public static void main(String[] args) throws FileNotFoundException {
//         Scanner in = new Scanner(new File("SANPHAM.in.txt"));
//         int n = Integer.valueOf(in.nextLine());
//         sanPham a[] = new sanPham[n];
//         for (int i=0; i<n; i++){
//             String id = in.nextLine();
//             String name = in.nextLine();
//             String price = in.nextLine();
//             String warranty = in.nextLine();
//             a[i] = new sanPham(id, name, price, warranty);
//         }
//         Arrays.sort(a);
//         for (sanPham i : a)
//             System.out.println(i);

//     }
// }
