import java.util.Scanner;

public class J02020 {
    public static Scanner in = new Scanner(System.in);

    public static void display(int[] a, int k){
        for (int i=1; i<=k; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }

    public static void main(String[] j02020){
        //delcare
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[k+1];
        //intialize
        for (int i=1; i<=k; i++)
            a[i] = i;
        //process
        int i=k, dem=1;
        display(a,k);
        while(i!=0){
            i=k;
            while(a[i]==(n-k+i)){
                i--;
            }
            if (i!=0){
                dem++;
                a[i]+=1;
                for (int j=i+1; j<=k; j++){
                    a[j]=a[j-1]+1;
                }
                display(a,k);
            }
        }
        System.out.println("Tong cong co "+dem+" to hop");
    }
}
