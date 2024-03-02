import java.util.Scanner;

public class J01009 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] mama){
        int n = in.nextInt();
        long s=0,p=1;
        for (int i=1; i<=n; i++){
            p=i*p;
            s=s+p;
        }
        System.out.println(s);
    }
}
