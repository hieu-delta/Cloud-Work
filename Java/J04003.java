import java.util.Scanner;

class phanso {
    long tuso, mauso;

    phanso (long tuso, long mauso){
        this.tuso = tuso;
        this.mauso = mauso;
    }

    long gcd (long a, long b){
        long r = a%b;
        while (r!=0){
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    void display (){
        long ucln = gcd (tuso, mauso);
        System.out.println((tuso / ucln) + "/" + (mauso / ucln));
    }
}

public class J04003 {
    static Scanner in = new Scanner(System.in);
    public static void main (String[] mama){
        long tuso = in.nextLong(), mauso = in.nextLong();
        phanso pso = new phanso(tuso,mauso);
        pso.display();
    }
}
