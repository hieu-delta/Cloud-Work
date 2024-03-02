import java.util.Arrays;
import java.util.Scanner;

public class J03027 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] j03027){
        String s = in.nextLine();
        int l=s.length();
        char[] a = s.toCharArray(), test = new char[l];
        int[] truoc = new int[l];
        truoc[0]=0; test[0]=' ';
        for (int i=1; i<l; i++){
            truoc[i]=i-1;
            test[i]=' ';
        }
        for (int i=1; i<l; i++){
            if (a[i]==a[truoc[i]]){
                a[i]=' ';
                a[truoc[i]]=' ';
                if (i<l-1)
                    truoc[i+1]=truoc[truoc[i]];
            }
        }
        if (Arrays.equals(a,test))
            System.out.println("Empty String");
        else{
            for (int i=0; i<l; i++)
                if (a[i]!=' ')
                    System.out.print(a[i]);
            System.out.println();
        }
    }
}
