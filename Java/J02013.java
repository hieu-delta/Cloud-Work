import java.util.Scanner;

public class J02013 {
    public static Scanner in = new Scanner(System.in);

    public static void display(int[] a, int n){
        for (int i=1; i<=n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] bubblesort){
        int n = in.nextInt();
        int[] a = new int[n+1];
        for (int i=1; i<=n; i++)
            a[i] = in.nextInt();
        
        int d=1;
        for (int i=1; i<n; i++){
            int check=0;
            for (int j=1; j<n-i+1; j++){
                if (a[j]>a[j+1]){
                    check=1;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            if (check==1){
                System.out.print("Buoc " + d +": ");
                display(a,n);
                d++;
            }
        }
    }
}
