package Others;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Pair<t1, t2> {
    int first;
    int second;

    Pair (int first, int second){
        this.first = first;
        this.second = second;
    }

    public String toString(){
        return "("+first + "," + second+")";
    }
}

public class danhsachcanh {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("DATA.in"));
        int n = Integer.valueOf(in.next()), a[][] = new int[n+1][n+1];
        ArrayList<Pair<Integer, Integer>> x = new ArrayList<Pair<Integer, Integer>>();
        for (int i=1; i<=n; i++)
            for (int j=1; j<=n; j++)
                a[i][j] = Integer.valueOf(in.next());
                
        for (int i=1; i<n; i++)
            for (int j=i+1; j<=n; j++){
                if (a[i][j]==1){
                    Pair<Integer, Integer> p = new Pair<>(i, j);
                    x.add(p);
                }   
            }  
               
        for (Pair<Integer,Integer> i : x)
            System.out.println(i);
    }
}
