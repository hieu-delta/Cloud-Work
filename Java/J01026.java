import java.util.Scanner;

public class J01026 {
    public static Scanner in = new Scanner(System.in);
    // public static int sonto(int n){
    //     if (n==2)
    //         return 1;
    //     for (int i=3; i<=sqrt(n); i++)
    //         if (n%i==0)
    //             return 0;
    //     return 1;
    // }
    public static void main(String[] mama){
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int a = (int) Math.sqrt(n);
            if (a*a==n)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
