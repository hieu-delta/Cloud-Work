import java.util.Arrays;
import java.util.Scanner;
class Product implements Comparable<Product>{
    String name, unit, buy, sell;
    int id, profit;
    Product (int id, String name, String unit, String buy, String sell){
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
        profit = Integer.valueOf(sell) - Integer.valueOf(buy);
    }

    public int compareTo(Product another){
        int profitCompare = Integer.compare(this.profit, another.profit);
        if (profitCompare!=0)
            return profitCompare;
        int idCompare = Integer.compare(this.id, another.id);
        return -idCompare;
    }

    public String toString(){
        String productID="MH";
        if (id<10)
            productID += "00" + id;
        else if (id<100)
            productID += "0" + id;
        return productID + " " + name + " " + unit + " " + buy + " " + sell + " " + profit;
    }
}

public class J05081 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        Product[] prd = new Product[n];
        String name, unit, buy, sell;
        int id=0;
        for (int i=0; i<n; i++){
            id++;
            name = in.nextLine();
            unit = in.nextLine();
            buy = in.nextLine();
            sell = in.nextLine();
            prd[i] = new Product(id, name, unit, buy, sell);
        }
        Arrays.sort(prd);
        for (int i=n-1; i>=0; i--)
            System.out.println(prd[i]);
    }
}
