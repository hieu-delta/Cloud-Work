import java.util.Scanner;
import java.util.Arrays;

public class J01025 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] mama){
        int t = 1;
        while(t-->0){
            int[] x = new int[5];
            int[] y = new int[5];
            for (int i=1; i<=4; i++){
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }
            Arrays.sort(x);
            Arrays.sort(y);
            int n;
            if (x[4]-x[1]<=y[4]-y[1])
                n = y[4] - y[1];
            else n = x[4] - x[1];
            System.out.println(n*n);
        }
    }
}
