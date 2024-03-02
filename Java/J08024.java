import java.util.Scanner;

public class J08024 {
    static Scanner in = new Scanner(System.in);

    static int check (int a[], int x){
        String temp = "";
        for (int i : a)
            temp += Integer.toString(i);
        int n = Integer.valueOf(temp);
        //System.out.println("temp: " + temp);
        if (n % x == 0)
            return n;
        else return 0;
    }

    static int binary_mod (int n, int x){
        int a[] = new int[n], j=n-1;
        while(true){
            while(j>=0 && a[j]==9)
                j--;
            if (j>=0){
                a[j] = 9;
                for (int i=j+1; i<n; i++)
                    a[i] = 0;
                j=n-1;
                if (check(a, x)!=0)
                    return check(a, x);
            }
            else break;
            
        }
        // if (check(a, x)!=0)
        //         return check(a, x);
        // else return 0;
        return 0;
    }

    public static void main(String[] args) {
        int t = in.nextInt();
        while(t-->0){
            int x = in.nextInt(),  n=0, ans=0;
            while(ans==0){
                n++;
                ans = binary_mod(n, x);
            }
            System.out.println(ans + " " + n);
        }
    }
}