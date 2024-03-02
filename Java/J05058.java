import java.util.Scanner;

class BangKeTienLuong {
    static int order = 1;
    String id = String.format("NV%02d", order++), name;
    int salary, extra, allowance, total;

    BangKeTienLuong (String name, int single, int day, String position){
        this.name = name;
        salary = single * day;
        if (day >= 25)
            extra = salary * 20/100;
        else if (day >= 22)
            extra = salary * 10/100;
        else 
            extra = 0;
        if (position.equals("GD"))
            allowance = 250000;
        else if (position.equals("PGD"))
            allowance = 200000;
        else if (position.equals("TP"))
            allowance = 180000;
        else if (position.equals("NV"))
            allowance = 150000;
        total = salary + extra + allowance;
    }

    public String toString () {
        return id + " " + name + " " + salary + " " + extra + " " + allowance + " " + total;
    }
}

public class J05058 {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        BangKeTienLuong a[] = new BangKeTienLuong[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            int single = in.nextInt();
            int day = in.nextInt();
            in.nextLine();
            String position = in.nextLine();
            a[i] = new BangKeTienLuong(name, single, day, position);
        }
        int sum = 0;
        for (int i=0; i<n; i++){
            System.out.println(a[i]);
            sum += a[i].total;
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
    
    
}
