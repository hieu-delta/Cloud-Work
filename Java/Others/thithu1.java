package Others;
import java.math.BigInteger;
import java.util.Scanner;

public class thithu1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String s = in.nextLine(), before, after;
        BigInteger x1, x2, sum;
        while(s.length()>1){
            before = s.substring(0, s.length()/2);
            after = s.substring(s.length()/2);
            x1 = new BigInteger(before);
            x2 = new BigInteger(after);
            sum = x1.add(x2);
            System.out.println(sum);
            s = sum.toString();
        }

    }
}
