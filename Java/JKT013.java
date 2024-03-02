import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JKT013 {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Long> list = new ArrayList<>();

    static long process (int a[]){
        String temp = "";
        for (int i : a)
            temp+=Long.toString(i);
        return Long.valueOf(temp);
    }

    static void binary_mod (int n){
        int a[] = new int[n], j=n-1;
        for (int i=0; i<n; i++)
            a[i] = 6;
        list.add(process(a));
        while(true){
            while(j>=0 && a[j]==8)
                j--;
            if (j>=0){
                a[j] = 8;
                for (int i=j+1; i<n; i++)
                    a[i] = 6;
                list.add(process(a));
                j = n-1;
            }
            else break;
        }
    }

    public static void main(String[] args) {
        int t = in.nextInt();
        while (t-->0){
            list.clear();
            int n = in.nextInt();
            n+=1;
            while(n-->1){
                //System.out.println(n);
                binary_mod(n);
            }
            Collections.sort(list);
            Collections.reverse(list);
            System.out.println(list.size());
            for (long i : list)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}