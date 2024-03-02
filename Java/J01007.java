import java.util.Scanner;

public class J01007 {
    public static Scanner in= new Scanner(System.in);
    public static void main(String[] mama){
        int t=in.nextInt();
        while(t-->0){
            long fb1=1,fb2=1,fb3=0,x;
            long n=in.nextLong();
            if (n==1)
                System.out.println("YES");
            else{
                while(fb3<n){
                    fb3=fb1+fb2;
                    x=fb1;
                    fb1=fb2;
                    fb2=x+fb1;
                }
                if (fb3==n)
                    System.out.println("YES");
                else 
                    System.out.println("NO");
            }
                
        }
    }
}
