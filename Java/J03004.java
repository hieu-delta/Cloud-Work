// import java.util.Scanner;
// import java.util.Character;

// public class J03004{
//     public static Scanner in = new Scanner(System.in);

//     public static void main(String[] j03004){
//         int t = in.nextInt();
//         in.nextLine();
//         while(t-->0){
//             String s = in.nextLine();
//             s = " "+s+" ";
//             int n = s.length();
//             for (int i=1; i<n-1; i++){
//                 if (s.charAt(i)!=' ')
//                     if (s.charAt(i-1)==' ')
//                         System.out.print(Character.toUpperCase(s.charAt(i)));
//                     else{
//                         System.out.print(Character.toLowerCase(s.charAt(i)));
//                         if (s.charAt(i+1)==' ')
//                             System.out.print(" ");
//                     }
//             }
//             System.out.println();
//         }
//     }
// }