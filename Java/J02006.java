import java.util.Scanner;

public class J02006 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] mama){
        int n = in.nextInt();
        int[] n1 = new int[n+1];
        int m = in.nextInt();
        int[] m1 = new int[m+1];
        int[] check = new int[1001];
        
        for (int i=1; i<=n; i++){
            n1[i] = in.nextInt();
            check[n1[i]] = 1;
        }

        for (int i=1; i<=m; i++){
            m1[i] = in.nextInt();
            check[m1[i]] = 1;
        }

        for (int i=1; i<=1000; i++)
            if (check[i]==1){
                System.out.print(i + " ");
            }
        System.out.println();

    }
}