// import java.util.Scanner;

// class fraction {
//     long tuso, mauso;

//     fraction (long tuso, long mauso){
//         this.tuso = tuso;
//         this.mauso = mauso;
//     }

//     long gcd (long a, long b){
//         long r = a%b;
//         while (b!=0){
//             r = a % b;
//             a = b;
//             b = r;
//         }
//         return a;
//     }

//     long lcm (long a, long b){
//         long ucln = gcd(a,b);
//         return (a * (b/ucln));
//     }

//     void toigian (){
//         long ucln = gcd (tuso, mauso);
//         tuso = tuso / ucln;
//         mauso = mauso / ucln;
//     }

//     void quydong (fraction p) {
//         long bcnn = lcm (this.mauso,p.mauso);
//         // System.out.println(tuso + "/" + mauso);
//         // System.out.println(p.tuso + "/" + p.mauso);
//         long x1 = bcnn / this.mauso, x2 = bcnn / p.mauso;
//         // System.out.print(this.tuso*x1 + p.tuso*x2);
//         // System.out.println("/"+bcnn);
//         this.tuso = this.tuso*x1 + p.tuso*x2;
//         this.mauso = bcnn;
//         toigian();
//         System.out.println(this.tuso+"/"+this.mauso);
//     }

// }

// public class J04004 {
//     public static Scanner in = new Scanner(System.in);
//     public static void main (String[] mama){
//         long tuso = in.nextLong(), mauso = in.nextLong();
//         fraction p1 = new fraction(tuso, mauso);
//         p1.toigian();
//         tuso = in.nextLong(); mauso = in.nextLong();
//         fraction p2 = new fraction(tuso, mauso);
//         p2.toigian();
//         p1.quydong(p2);
//     }
// }
