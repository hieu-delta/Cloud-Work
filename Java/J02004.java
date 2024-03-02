import java.util.Scanner;

public class J02004{
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] mama){
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[] a = new int[n+1];
            for (int i=1; i<=n; i++)
                a[i] = in.nextInt();
            int check=1, x=n/2;
            for (int i=1; i<=x; i++){
                if (a[i]!=a[n-i+1]){
                    check=0;
                    break;
                }
            }
            if (check==1)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}