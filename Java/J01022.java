import java.util.Scanner;

public class J01022 {
    public static Scanner in = new Scanner(System.in);
    public static long[] fibo = new long[100];

    public static String binaryfb(int n, long k){
        if (n==1)
            return "0";
        if (n==2)
            return "1";
        if (k<=fibo[n-2])
            return binaryfb(n-2,k);
        else 
            return binaryfb(n-1,k-fibo[n-2]); 
    }

    public static void fibonaci(){
        fibo[1]=1;
        fibo[2]=1;
        for (int i=3;i<=92; i++)
            fibo[i] = fibo[i-1] + fibo[i-2];
    }

    public static void main(String[] arg){
        int t = in.nextInt();
        fibonaci();
        while(t-->0){
            int n = in.nextInt();
            long k = in.nextLong();
            String check=binaryfb(n,k);
            System.out.println(check);
        } 
    }
}