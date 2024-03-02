import java.util.Scanner;

public class J01021 {
    public static Scanner in = new Scanner(System.in);
    public static long o = 1000000007;
    public static long luythua(long x){
        return (x%o*x%o)%o;
    }
    public static long truyhoi(long a, long b){
        if (b==0)
            return 1;
        else 
            if (b%2==0)
                return luythua(truyhoi(a,b/2));
            else 
                return (a*luythua(truyhoi(a,b/2)))%o;
    }
    public static void main(String[] j02021){
        long a=1, b=1;
        while(a!=0 || b!=0){
            a = in.nextLong();
            b = in.nextLong();
            // if (b==0)
            //     System.out.println(1);
            // else{
            //     long p = a;
            //     for (long i=2; i<=b; i++)
            //         p = (p%x * a%x)%x;
            //     System.out.println(p);
            // }
            if (a!=0 || b!=0)
                System.out.println(truyhoi(a,b));
        }
    }
}