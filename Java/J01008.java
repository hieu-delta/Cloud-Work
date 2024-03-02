import java.util.Scanner;

public class J01008 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] mama){
        int t=in.nextInt();
        int test=1;
        while(t-->0){
            long n=in.nextLong();
            int i=1,dem=0;
            System.out.print("Test " + test +": ");

            if (n>1)
                while(n!=1){
                    i++;
                    while(n%i==0){
                           n=n/i;
                           dem++;
                    }
                    if (dem!=0)
                        System.out.print(i + "(" + dem + ") ");
                    dem=0;
                }
                
            System.out.println();
            
            test++;
        }
    }
}