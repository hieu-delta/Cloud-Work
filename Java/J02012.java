import java.util.Scanner;

public class J02012 {
    public static Scanner in = new Scanner(System.in);
    public static void display(int[] a, int n, int[] check){
        for (int i=1; i<=n; i++)
            if (check[i]==1)
                System.out.print(a[i] + " ");
        System.out.println();
    }
    public static void main(String[] insertionsort){
        int n = in.nextInt();
        int[] a = new int[n+1];
        int[] check = new int[n+1];
        for (int i=1; i<=n; i++)
            a[i] = in.nextInt();
        
        for (int i=1; i<=n; i++){
            check[i] = 1;
            for (int j=1; j<=i-1; j++){
                if (a[i]<a[j]){
                    int temp = a[i];
                    for (int k=i; k>=j+1; k--)
                        a[k]=a[k-1];
                    a[j] = temp;
                    break;
                }
            }
            System.out.print("Buoc " + (i-1) +": ");
            display(a,n,check);
        }
    }
}
