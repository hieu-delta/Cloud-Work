import java.util.Scanner;

public class J02011 {
    public static Scanner in = new Scanner(System.in);
    public static void display(int[] a, int n){
        for (int i=1; i<=n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    public static void main(String[] selectionsort){
        int n = in.nextInt(), check=1;
        int[] a = new int[n+1];
        for (int i=1; i<=n; i++){
            a[i] = in.nextInt();
            if (a[i]<a[i-1])
                check=0;
        }
        if (check==0){
            for (int i=1; i<n; i++){
                int min=101, y=0;
                for (int j=i+1; j<=n; j++) //find min
                    if (a[j]<min){
                        min = a[j];
                        y = j;
                    }
                if (a[i]>a[y]){ //swap 
                    int temp = a[i];
                    a[i] = a[y];
                    a[y] = temp;
                }
                System.out.print("Buoc " + i +": "); //print
                display(a,n);
            }
        }
        else {
            System.out.print("Buoc 1: ");
            display(a,n);
        }
    }
}