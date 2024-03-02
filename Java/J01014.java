import java.util.Scanner;

public class J01014{
    public static Scanner in = new Scanner(System.in);
    public static long prime(long n){
        if (n==2)
            return 1;
        for (int i=2; i<=Math.sqrt(n); i++)
            if (n%i==0)
                return 0;
        return 1;
    }

    public static void main(String[] mama){
        int t = in.nextInt();
        while(t-->0){
            long n = in.nextLong();
            if (prime(n)==1)
                System.out.println(n);
            else
                for (long i=2; i<=n; i++)
                    if (n%i==0)
                        if (prime(n/i)==1){
                            System.out.println(n/i);
                            break;
                        }
        }
    }
}