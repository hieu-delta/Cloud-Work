import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] j01011){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String a = in.nextLine();
            String b = in.nextLine();
            BigInteger a1 = new BigInteger(a), b1 = new BigInteger(b);
            BigInteger lcm = (a1.multiply(b1)).divide(a1.gcd(b1));
            System.out.println(lcm);
        }
    }
}
