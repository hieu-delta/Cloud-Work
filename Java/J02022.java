import java.util.Arrays;
import java.util.Scanner;

public class J02022 {
    public static Scanner in = new Scanner(System.in);

    public static int check(int[] a,int n){
        for (int i=1; i<n; i++)
            if (Math.abs(a[i]-a[i+1])==1)
                return 0;
        return 1;
    }

    public static void display(int[] a, int n){
        for (int i=1; i<=n; i++)
            System.out.print(a[i]);
        System.out.println();
    }

    public static void main(String[] j02022){
        int t = in.nextInt();
        while(t-->0){
                                                    //declare
            int n= in.nextInt();
            int[] a = new int[n+1];
                                                    //intialize
            for (int i=0; i<=n; i++)
                a[i]=i;
                                                    //process
            int i=n;
            while(i!=1){
                i=n;
                while(a[i-1]>a[i])
                    i--;
                if (i!=1){
                    for (int j=n; j>=i; j--)
                        if (a[j]>a[i-1]){           //swap
                            int temp = a[i-1];
                            a[i-1] = a[j];
                            a[j] = temp;
                            Arrays.sort(a, i, n+1);
                            break;
                        }
                    if (check(a,n)==1)
                        display(a,n);
                }
            }
        }
    }
}
