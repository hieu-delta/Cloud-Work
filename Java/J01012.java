import java.util.Scanner;

public class J01012 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] mama){
        int t = in.nextInt();
        while(t-->0){
            long n = in.nextLong();
            int count = 0;
            if (n%2!=0)
                System.out.println(count);
            else if (n==2)
                System.out.println(count+1);
            else{
                count++;
                int a = (int) Math.sqrt(n);
                for (int i=2; i<=a; i++){
                    if (n%i==0){
                        if (i%2==0)
                            count++;
                        if ((n/i)%2==0)
                            count++;
                    }
                }
                if (a*a==n)
                    count--;
                System.out.println(count);
            }
            
        }
    }
}
