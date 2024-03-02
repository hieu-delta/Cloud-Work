import java.util.Scanner;

public class J02014 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] j02014){
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt(), check=0;
            int[] a = new int[n+2];
            int[] truoc = new int[n+1];
            truoc[1]=0;
            int[] sau = new int[n+2];
            sau[n+1]=0;
            for (int i=1; i<=n; i++){
                a[i] = in.nextInt();
                truoc[i]=truoc[i-1]+a[i-1];
            }
            for (int i=n; i>=1; i--){
                sau[i]=sau[i+1]+a[i+1];
            }
            for (int i=1; i<=n; i++)
                System.out.println(i +" " +truoc[i] +" " + sau[i]);
            if (check!=0)
                System.out.println(check);
            else System.out.println(-1);
        }
    }
}
