import java.util.Scanner;

class LapBangTinhCong {
    static int order = 1;
    String id = String.format("NV%02d", order++), name, position;
    int wage, day, extra, allowance, salary, total;
    
    LapBangTinhCong (String name, int wage, int day, String position){
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

    public String toString (){
        return id + " " + name + " " + salary + " " + extra + " " + allowance + " " + total;
    }
}

public class J05040 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        LapBangTinhCong a[] = new LapBangTinhCong[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            int wage = in.nextInt();
            int day = in.nextInt();
            in.nextLine();
            String position = in.nextLine();
            a[i] = new LapBangTinhCong(name, wage, day, position);
        }
        for (LapBangTinhCong i : a)
            System.out.println(i);
    }
}