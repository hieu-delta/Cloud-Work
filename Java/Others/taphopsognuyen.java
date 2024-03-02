package Others;
import java.util.Scanner;

public class taphopsognuyen {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n=in.nextInt(), m=in.nextInt();
        int a[] = new int[n], b[] = new int[m], checka[] = new int[1001], checkb[] = new int[1001];
        for (int i=0; i<n; i++){
            a[i]=in.nextInt();
            checka[a[i]]++;
        }
        for (int i=0; i<m; i++){
            b[i]=in.nextInt();
            checkb[b[i]]++;
        }
        for (int i=0; i<1001; i++)
            if (checka[i]>0 && checkb[i]>0)
                System.out.print(i+" ");
        System.out.println();
        for (int i=0; i<1001; i++)
            if (checka[i]>0 && checkb[i]==0)
                System.out.print(i+" ");
        System.out.println();
        for (int i=0; i<1001; i++)
            if (checka[i]==0 && checkb[i]>0)
                System.out.print(i+" ");
        System.out.println();


    }
}
