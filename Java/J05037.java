import java.util.Arrays;
import java.util.Scanner;

class TinhGiaBan2 implements Comparable<TinhGiaBan2> {
    static int order = 1;
    String name, unit, id = String.format("MH%02d", order++);
    int price, quantity, sell, shipment;

    TinhGiaBan2 (String name, String unit, float price, int quantity) {
        this.name = name;
        this.unit = unit;
        calculate(price, quantity);
    }

    void calculate (float price, int quantity) {
        this.quantity = quantity;
        this.shipment = Math.round(quantity * price * 5/100);
        this.price = Math.round(price * quantity + this.shipment);
        this.sell = (int) Math.ceil((float) ((this.price + this.price*2/100) / quantity) / 100) * 100;
    }

    public int compareTo (TinhGiaBan2 x){
        return -Integer.compare(this.sell, x.sell);
    }

    public String toString () {
        return id + " " + name + " " + unit + " " + shipment + " " + price + " " + sell;
    }
}

public class J05037 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        TinhGiaBan2 a[] = new TinhGiaBan2[n];
        for (int i=0; i<n; i++){
            in.nextLine();
            String name = in.nextLine();
            String unit = in.nextLine();
            float price = in.nextFloat();
            int quantity = in.nextInt();
            a[i] = new TinhGiaBan2(name, unit, price, quantity);
        }
        Arrays.sort(a);
        for (TinhGiaBan2 i : a)
            System.out.println(i);
    }
}