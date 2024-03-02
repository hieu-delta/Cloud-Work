import java.util.Scanner;

public class J02017 {
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] j02017){
        int n = in.nextInt(), dem=n;
        int[] a = new int[n+1];
        int[] truoc = new int[n+1];
        for (int i=1; i<=n; i++){
            a[i] = in.nextInt();
            truoc[i]=i-1;
        }
        for (int i=2; i<=n; i++){
            if ((a[i]+a[truoc[i]])%2==0 && a[truoc[i]]!=0){
                a[i]=0;
                a[truoc[i]]=0;
                if (i<n)
                    truoc[i+1]=truoc[truoc[i]];
                dem=dem-2;
            }
        }
        System.out.println(dem);
    }
}
