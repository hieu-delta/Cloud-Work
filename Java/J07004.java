import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        int[] a = new int[1001];
        while(in.hasNext()==true){
            int n = Integer.valueOf(in.next());
            a[n]++;
        }
        for (int i=0; i<=1000; i++)
            if (a[i]!=0)
                System.out.println(i+" "+a[i]);
    }
}
