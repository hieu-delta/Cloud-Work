package Others;
// import java.util.Scanner;

// public class manh {
//     public static int check(String s){
//         // String s="";
//         String s1=s.toLowerCase();
//             int m=s1.length();
//             for(int i=0;i<s1.length()/2;i++){
//                 int n=(int)(s1.charAt(i))-(int)(s1.charAt(m-i-1));
//                 if(Math.abs(n)>3){
//                     return 0;
//                 }
//                 else {
//                     if(n==3){
//                         if(s1.charAt(i)!='p' && s1.charAt(i)!='q' && s1.charAt(i)!='r' && s1.charAt(i)!='s' && s1.charAt(i)!='w' && s1.charAt(i)!='x'&& s1.charAt(i)!='y'&& s1.charAt(i)!='z');
//                             return 0;
//                     }
//                 }

//             }
//             return 1;
//         }
//     public static void main(String[] args) {
//         Scanner ip=new Scanner(System.in);
//         int t=ip.nextInt();
//         ip.nextLine();
//         while(t-->0){
//             String s=ip.nextLine();
//             // StringBuilder sb = new StringBuilder(s);
//             // System.out.println(s.toLowerCase())
//             if(check(s)==1)
//                 System.out.println("YES");
//             else System.out.println("NO");
//         }
//     }
// }
