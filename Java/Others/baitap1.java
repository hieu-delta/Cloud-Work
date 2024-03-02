package Others;
import java.util.Scanner;

public class baitap1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int check[] = new int[1001];
            for (int i=0; i<n; i++){
                int temp = in.nextInt();
                check[temp]++;
            }
            for (int i=0; i<=1000; i+=2)
                if (check[i]!=0)
                    System.out.print(i+" ");
            System.out.println();
            for (int i=999; i>=1; i-=2)
                if (check[i]!=0)
                    System.out.print(i+" ");
            System.out.println();
        }
    }
}
