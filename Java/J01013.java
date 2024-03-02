import java.util.Scanner;

public class J01013 {
    public static Scanner in = new Scanner(System.in);
    
    public static long[] prime = new long[2000001];
    public static void sangnto(){
        for (long i=2; i<=2000000; i++)
            prime[(int) i]=1;
        for (long j=2; j<=2000000; j++)
            if (prime[(int) j]==1){
                long p=2;
                while(p*j<=2000000){
                    prime[(int) (p*j)]=0;
                    p++;
                }
            }
    }

    public static void main(String[] mama){
        sangnto();
        int t=in.nextInt();
        long sum=0;
        while(t-->0){
            long n=in.nextLong();
            long uoc=2;
            while(n>1){
                if (prime[(int) uoc]==1){
                    while (n%uoc==0){
                        n=n/uoc;
                        sum+=uoc;
                    //    System.out.println("uoc "+uoc);
                    }
                }
                if (prime[(int) n]==1){
                    sum+=n;
                //    System.out.println("n "+n);
                    break;
                }
                uoc++;
            }
        //    System.out.println("sum "+sum);
        }
        System.out.print(sum);
    }
}
