import java.math.BigInteger;
import java.util.Scanner;

public class J03029 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] j03029){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String a = in.next(), b = in.next();
            BigInteger a1 = new BigInteger(a), b1 = new BigInteger(b), c1, c2, check = new BigInteger("0");
            c1 = a1.mod(b1);
            c2 = b1.mod(a1);
            // System.out.println(c1 +" "+ c2 +" "+ check);
            if (c1.compareTo(check)==0 || c2.compareTo(check)==0)
                System.out.println("YES");
            else System.out.println("NO");
        } 
    }
}
