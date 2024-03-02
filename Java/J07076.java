import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class J07076 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Input/MATRIX.in"));
        int t = Integer.valueOf(in.nextLine());
        while(t-->0){
            int n = Integer.valueOf(in.next()), m = Integer.valueOf(in.next()), k = Integer.valueOf(in.next());
            int a[][] = new int[n+1][m+1], temp[] = new int[n+1];
            for (int i=1; i<=n; i++)
                for (int j=1; j<=m; j++)
                    a[i][j] = Integer.valueOf(in.next());
            for (int i=1; i<=n; i++)
                temp[i] = a[i][k];
            Arrays.sort(temp);
            for (int i=1; i<=n; i++)
                a[i][k] = temp[i];
            for (int i=1; i<=n; i++){
                for (int j=1; j<=m; j++)
                    System.out.print(a[i][j]+" ");
                System.out.println();
            }
        }
    }
}
