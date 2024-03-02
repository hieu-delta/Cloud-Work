package Others;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Matrix {
    int n, m, k;

    Matrix (int n, int m, int k){
        this.n = n;
        this.m = m;
        this.k = k;
    }

    int mtx[][] = new int[n+1][m+1];

    void process(int a[][]){
        mtx = a;
        int temp[] = new int[n+1];
        for (int i=1; i<=n; i++)
            temp[i] = mtx[i][k];
        Arrays.sort(temp);
        for (int i=1; i<=n; i++)
            mtx[i][k] = temp[i];
       
    }

    public String toString (){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++)
                System.out.print(mtx[i][j]+" ");
            System.out.println();
        }
        return "";
    }
}

public class baitap3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Input/MATRIX.in"));
        int t = Integer.valueOf(in.nextLine());
        while(t-->0){
            int n = Integer.valueOf(in.next()), m = Integer.valueOf(in.next()), k = Integer.valueOf(in.next());
            int a[][] = new int[n+1][m+1];
            for (int i=1; i<=n; i++)
                for (int j=1; j<=m; j++)
                    a[i][j] = Integer.valueOf(in.next());
            Matrix x = new Matrix(n,m,k);
            x.process(a);
            System.out.println(x);
        }
    }
}
