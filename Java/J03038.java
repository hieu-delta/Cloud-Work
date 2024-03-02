import java.util.Arrays;
import java.util.Scanner;

public class J03038 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] j03038){
        int t = 1;
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            s=s+" ";
            char[] a = s.toCharArray();
            Arrays.sort(a);
            int dem=0;
            for (int i=1; i<s.length(); i++)
                if (a[i]!=a[i-1])
                    dem++;
            // for (int i=0; i<s.length(); i++)
            //     System.out.print(a[i]+" ");
            System.out.println(dem);
        }
    }
}
