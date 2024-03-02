import java.util.Scanner;

public class J01011{
    public static Scanner in = new Scanner(System.in);
    public static long gcd(long a, long b){
        long r=0;
        while(b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static void main(String[] mama){
        int t = in.nextInt();
        while(t-->0){
            long a = in.nextInt();
            long b = in.nextInt();
            long uoc = gcd(a,b);
            long boi = a*b/uoc;
            System.out.println(boi + " " + uoc);
        }
    }

}