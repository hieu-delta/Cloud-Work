import java.util.Scanner;

public class J02034 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] j02034){
        int n = in.nextInt(), check=1;
        int[] a = new int[n+1];
        for (int i=1; i<=n; i++){
            a[i] = in.nextInt();
            for (int j=a[i-1]+1; j<a[i]; j++){
                System.out.println(j);
                check=0;
            }
        }
        if (check==1)
            System.out.println("Excellent!");
    }

}
