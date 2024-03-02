import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Pair<t1, t2> {
    int first;
    int second;

    Pair (int first, int second){
        this.first = first;
        this.second = second;
    }

    boolean isPrime() {
        for (int i=2; i<=Math.sqrt((int) first); i++)
            if ((int) first % i==0)
                return false;
        for (int i=2; i<=Math.sqrt((int) second); i++)
            if ((int) second % i ==0)
                return false;
        return true;
    }

    public String toString(){
        return first + " " + second;
    }
}

public class J07017 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
            }
    }
}