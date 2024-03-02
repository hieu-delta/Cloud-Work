package Others;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class phep_toan_co_ban {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in  = new Scanner(new File("DAYSO.in"));
        int n = Integer.valueOf(in.nextLine());
        BigInteger a[] = new BigInteger[n], sum = BigInteger.valueOf(0);
        for (int i=0; i<n; i++){
            //String s = in.nextLine();
            a[i] = new BigInteger(in.nextLine());
            sum = sum.add(a[i]);
        }
        Arrays.sort(a);
        System.out.println(a[0]);
        System.out.println(a[n-1]);
        System.out.println(sum);
    }
}
