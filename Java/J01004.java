import java.util.Scanner;
import java.lang.Math;

public class J01004 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] mama){
        double t = in.nextDouble();
        while(t-->0){
            double n=in.nextDouble();
            int check=1;
            for (int i=2; i<=Math.sqrt(n); i++)
                if (n%i==0){
                    check=0;
                    break;
                }
            if (check==1)
                System.out.println("YES");
            else    
                System.out.println("NO");
        }
    }
}
