// package Others;

// import java.io.File;
// import java.io.IOException;
// import java.util.Scanner;

// class Pair <t1, t2> {
//     t1 a;
//     t2 b;

//     static int checkNto[] = new int[1000001];
    
//     void runNto(){
//         for(int i = 2; i < checkNto.length; i++){
//             checkNto[i] = 1;
//         }
//         for(int i = 2; i < checkNto.length; i++){
//             if(checkNto[i] == 1){
//                 for(int j = i * 2; j < checkNto.length; j ++){
//                     checkNto[j] = 0;
//                 }
//             }
//         }
//     }

//     this.runNto;

//     Pair<>(t1 a, t2 b){
//         this.a = a;
//         this.b = b;
//     }
// }

// public class hoang {
//     public static void main(String[] args) throws IOException {
//         Scanner sc = new Scanner(new File("DATA.in"));
//         int t = sc.nextInt();
//         while(t-->0){
//             int n = sc.nextInt();
//             boolean check = false;
//             for(int i = 2; i <= 2*Math.sqrt(n); i++){
//                 Pair<Integer, Integer> p = new Pair<>(i, n-i);
//                 if(p.isPrime()){
//                     System.out.println(p);
//                     check = true;
//                     break; 
//                 }
//             }
//             if(!check) System.out.println(-1);
//         }
//     }
// }

