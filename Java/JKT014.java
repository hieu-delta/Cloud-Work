import java.util.Scanner;

public class JKT014 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt(), a[] = new int[n], l[] = new int[n];
            for (int i=0; i<n; i++){
                a[i] = in.nextInt();
                if (i>0 && a[i] == a[i-1])
                    l[i] = l[i-1] + 1;
                else{
                    for (int j=i; j>=0; j--){
                        if (a[j] <= a[i])
                            l[i]++;
                        else break;
                    }
                }
            }
            for (int i : l)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
