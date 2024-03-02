import java.util.Scanner;

public class J01006 {
    public static Scanner in= new Scanner(System.in);
    public static void main(String[] mama){
        int t=in.nextInt();
        while(t-->0){
            long fb1=1,fb2=1,fb3=0,x;
            int n=in.nextInt();
            if (n<3)
                System.out.println(fb1);
            else{
                for (int i=3; i<=n; i++){
                    fb3=fb1+fb2;
                    x=fb1;
                    fb1=fb2;
                    fb2=x+fb1;
                }
                System.out.println(fb3);
            }
                
        }
    }
}
