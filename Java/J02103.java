import java.util.Scanner;

public class J02103 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] j02103){
        int t = in.nextInt();
        for (int test=1; test<=t; test++){
            //declare
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] a1 = new int[n+1][m+1];
            int[][] a2 = new int[m+1][n+1];
            //initialize
            for (int i=1; i<=n; i++)
                for (int j=1; j<=m; j++)
                    a1[i][j] = in.nextInt();
            for (int i=1; i<=m; i++){
                for (int j=1; j<=n; j++){
                    a2[i][j] = a1[j][i];
                    System.out.print(a2[i][j]+" ");
                }
                System.out.println();
            }

            //process
            // System.out.println("Test "+test+": ");
            // for (int i=1; i<=n; i++){
            //     for (int j=1; j<=n; j++){
            //         int sum = 0;
            //         for (int d=1; d<=m; d++)
            //             sum+=a1[i][d]*a2[d][j];
            //         System.out.print(sum+" ");
            //     }
            //     System.out.println();
            // }
        }
    }
}
