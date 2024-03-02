import java.util.Scanner;

public class J02005 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] mama){
        int n = in.nextInt();
        int[] n1 = new int[n+1];
        int m = in.nextInt();
        int[] m1 = new int[m+1];
        int[] checkn = new int[1001];
        int[] checkm = new int[1001];
        
        for (int i=1; i<=n; i++){
            n1[i] = in.nextInt();
            checkn[n1[i]] = 1;
        }

        for (int i=1; i<=m; i++){
            m1[i] = in.nextInt();
            checkm[m1[i]] = 1;
        }

        for (int i=1; i<=1000; i++)
            if (checkn[i]==1 && checkm[i]==1){
                System.out.print(i + " ");
            }
        System.out.println();

    }
}