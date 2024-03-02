import java.util.Scanner;
import java.lang.Math;

public class J01005 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] mama){
        int t=in.nextInt();
        while(t-->0){
            double n=in.nextDouble();
            double h=in.nextDouble();
            for (int i=1; i<n; i++){
                double r=i/n;
                double x=h*Math.sqrt(r);           
                System.out.printf("%.6f",x);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
