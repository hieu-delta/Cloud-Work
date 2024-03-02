import java.util.Arrays;
import java.util.Scanner;

public class J08015 {
    static Scanner in = new Scanner(System.in);
    static int BinarySearch (long[] a, int l, int r, long k){
        int m=(l+r)/2;
        while(l<=r){
            if (a[m]==k)
                return m;
            if (a[m] < k)
                l = m+1;
            if (a[m] > k)
                r = m-1;
            m = (l+r)/2;
        }
        return 0;
    }

    public static void main(String[] args) {
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt(), k = in.nextInt(), count=0;
            long a[] = new long[n];
            for (int i=0; i<n; i++){
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            // for (long i : a)
            //     System.out.print(i+ " ");
            // System.out.println();
            for (int i=0; i<n; i++){
                if (a[i] > k/2)
                    break;
                long x = (k - a[i]);
                int temp = BinarySearch(a, i+1, n-1, x);
                if (temp!=0){
                    //System.out.print(a[i]+"("+i+")"+"-");
                    for (int j=temp; j>i; j--)
                        if (a[j]==x){
                            //System.out.print(a[j]+"("+j+")"+" ");
                            count++;
                        }          
                        else if (a[j]<x)
                                break; 
                    //System.out.println();  
                    
                }
            }
            System.out.println(count);
        }
    }
}

