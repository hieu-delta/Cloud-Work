import java.util.Scanner;

public class J02101 {
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] j02101){
        int t = in.nextInt();
        while(t-->0){
            int n= in.nextInt();
            int[][] matrix = new int[n+1][n+1];
            for (int i=1; i<=n; i++)
                for (int j=1; j<=n; j++)
                    matrix[i][j] = in.nextInt();
            
            for (int i=1; i<=n; i++)
                if (i%2!=0)
                    for (int j=1; j<=n; j++)
                        System.out.print(matrix[i][j]+" ");
                else 
                    for (int j=n; j>=1; j--)
                        System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }
}
