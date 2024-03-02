import java.util.Scanner;

public class J02106 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] j02106){
        int n = in.nextInt(), dem=0;
        int[][] a = new int[n+1][4];
        for (int i=1; i<=n; i++){
            int d=0;
            for (int j=1; j<=3; j++){
                a[i][j] = in.nextInt();
                if (a[i][j]==1)
                    d++;
            }
            if (d>=2)
                dem++;
        }
        System.out.println(dem);
    }
}