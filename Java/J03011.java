import java.util.Scanner;

public class J03011 {
    public static Scanner in = new Scanner(System.in);
    public static long gcd_ultra(long a, String b){
        long b1 = 0;
        for (int i=0; i<b.length(); i++)
            b1 = (b1*10 + b.charAt(i)-'0')%a;
        while(b1!=0){
            long r = a%b1;
            a = b1;
            b1 = r;
        }
        return a;
    }
    public static void main(String[] j01011){
        int t = in.nextInt();
        while(t-->0){
            long a = in.nextLong();
            in.nextLine();
            String b = in.nextLine();
            long ucln = gcd_ultra(a,b);
            System.out.println(ucln);
        }
    }
}
