import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07008 {
    public static int check(int n, int a[], int b[]){
        ArrayList<Integer> x = new ArrayList<>();
        for (int i=1; i<=n; i++)
            if (b[i]==1)
                x.add(a[i]);
        if (x.size()<=1)
            return 0;
        for (int i=1; i<x.size(); i++)
            if (x.get(i) - x.get(i-1) <= 0)
                return 0;
        return 1;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DAYSO.in")); 
        int n = Integer.valueOf(in.next()), a[] = new int[n+1], b[] = new int[n+1], i;
        ArrayList<String> s = new ArrayList<String>();

        for (i=1; i<=n; i++){
            a[i] = Integer.valueOf(in.next());
            b[i]=0;
        }

        while(i>0){
            i=n;
            while(b[i]!=0)
                i--;
            b[i]=1;
            for (int j=i+1; j<=n; j++)
                b[j]=0;
            if (check(n,a,b)==1){
                String temp="";
                for (int j=1; j<=n; j++)
                    if (b[j]==1)
                        temp+=a[j]+" ";
                s.add(temp);
            }           
        }

        Collections.sort(s);
        for (String x : s)
            System.out.println(x);
        
    }
}
