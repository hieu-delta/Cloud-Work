import java.util.Scanner;

class TinhGiaBan {
    static int order = 1;
    String name, unit, id = String.format("MH%02d", order++);
    int price, quantity, sell, shipment;

    TinhGiaBan (String name, String unit, int price, int quantity) {
        this.name = name;
        this.unit = unit;
        calculate(price, quantity);
    }

    void calculate (int price, int quantity) {
        this.quantity = quantity;
        this.shipment = Math.round((float) quantity*price*5/100);
        this.price = Math.round((float) price*quantity + this.shipment);
        this.sell = this.price + Math.round((float) this.price*2/100);
    }

    public String toString () {
        return id + " " + name + " " + unit + " " + shipment + " " + price + " " + sell;
    }
}

public class J05056 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        TinhGiaBan a[] = new TinhGiaBan[n];
        for (int i=0; i<n; i++){
            in.nextLine();
            String name = in.nextLine();
            String unit = in.nextLine();
            int price = in.nextInt();
            int quantity = in.nextInt();
            a[i] = new TinhGiaBan(name, unit, price, quantity);
        }
        for (TinhGiaBan i : a)
            System.out.println(i);
    }
}