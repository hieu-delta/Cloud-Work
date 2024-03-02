package Others;
import java.util.Arrays;
import java.util.Scanner;

public class binary_search {
    static Scanner in = new Scanner(System.in);
    static int BinarySearch (int[] a, int i, int n, int k){
        int l=0, r=n-1, m=(l+r)/2;
        while(l<=r){
            if (a[m]==k)
                return 1;
            if (a[m] < k)
                l = m+1;
            if (a[m] > k)
                r = m-1;
            m = (l+r)/2;
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = in.nextInt(), a[] = new int[n], k=1;
        for (int i=0; i<n; i++)
            a[i] = in.nextInt();
        Arrays.sort(a);
        for (int i : a)
            System.out.print(i+" ");
        System.out.println();
        while(k!=0){
            if (k==0)
                break;
            k = in.nextInt();
            System.out.println(BinarySearch(a,0,n,k));
        }
    }
}
