import java.util.Scanner;

public class J02010 {
    public static Scanner in = new Scanner(System.in);

    public static void display(int[] a, int n){
        for (int i=1; i<=n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] interchangesort){
        int n = in.nextInt(), check=1;
        int[] a = new int[n+1];
        for (int i=1; i<=n; i++)
            a[i] = in.nextInt();
        
        for (int i=1; i<n; i++){
            for (int j=i+1; j<=n; j++){
                if (a[j]<a[i]){ //swap
                    check=0;
                    int temp=a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            if (check!=1){
            System.out.print("Buoc " + i +": "); //print
            display(a,n);
            }
        }
        if (check==1){
            System.out.print("Buoc 1: ");
            display(a,n);
        }

    }
}