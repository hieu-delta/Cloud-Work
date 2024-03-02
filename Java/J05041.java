import java.util.Arrays;
import java.util.Scanner;

class SapXepBangTinhCong implements Comparable<SapXepBangTinhCong>{
    static int order = 1;
    String id = String.format("NV%02d", order++), name, position;
    int wage, day, extra, allowance, salary, total;
    
    SapXepBangTinhCong (String name, int wage, int day, String position){
        this.name = name;
        this.wage = wage;
        this.day = day;
        this.position = position;
        calculate();
    }

    void calculate (){
        if (position.equals("GD"))
            allowance = 250000;
        else if (position.equals("PGD"))
            allowance = 200000;
        else if (position.equals("TP"))
            allowance = 180000;
        else 
            allowance = 150000;
        salary = wage * day;
        if (day >= 25)
            extra = salary * 2 / 10;
        else if (day >= 22)
            extra = salary * 1 / 10;
        else
            extra = 0;
        total = salary + extra + allowance;
    }

    public int compareTo (SapXepBangTinhCong x){
        return -Integer.compare(this.total, x.total);
    }

    public String toString (){
        return id + " " + name + " " + salary + " " + extra + " " + allowance + " " + total;
    }
}

public class J05041 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        SapXepBangTinhCong a[] = new SapXepBangTinhCong[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            int wage = in.nextInt();
            int day = in.nextInt();
            in.nextLine();
            String position = in.nextLine();
            a[i] = new SapXepBangTinhCong(name, wage, day, position);
        }
        Arrays.sort(a);
        for (SapXepBangTinhCong i : a)
            System.out.println(i);
    }
}