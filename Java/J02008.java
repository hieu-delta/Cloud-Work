import java.util.Scanner;

public class J02008 {
    public static Scanner in = new Scanner(System.in);
    public static long gcd(long a, long b){
        long r;
        while(b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        return a;
    }

    public static long lcm(long a, long b){
        return a * (b/gcd(a,b));
    }
    public static void main(String[] j02008){
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            long bscnn=0;
            bscnn = 1;
            for (int i=2; i<=n; i++)
                bscnn = lcm(i, bscnn);
            System.out.println(bscnn);
        }

    }
}
