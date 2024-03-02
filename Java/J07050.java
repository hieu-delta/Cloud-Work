import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class MatHang implements Comparable<MatHang>{
    static int stt = 1;
    String name, type, id = "MH" + String.format("%02d",stt++);
    Float buy, sell, profit;

    MatHang (String name, String type, String buy, String sell){
        this.name = name;
        this.type = type;
        this.buy = Float.valueOf(buy);
        this.sell = Float.valueOf(sell);
        profit = this.sell - this.buy;

    }

    public int compareTo (MatHang x){
        return -Float.compare(this.profit, x.profit);
    }

    public String toString (){
        return id + " " + name + " " + type + " " + String.format("%.2f",profit);
    }
}

public class J07050 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MATHANG.in.txt"));
        int n = Integer.valueOf(in.nextLine());
        MatHang a[] = new MatHang[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            String type = in.nextLine();
            String buy = in.nextLine();
            String sell = in.nextLine();
            a[i] = new MatHang(name, type, buy, sell);
        }
        Arrays.sort(a);
        for (MatHang i : a)
            System.out.println(i);
    }
}