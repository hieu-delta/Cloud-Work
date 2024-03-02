import java.util.Arrays;
import java.util.Scanner;

class SapXepDanhSachMatHang implements Comparable<SapXepDanhSachMatHang>{
    static int order=1;
    String name, type;
    float profit;
    int id = order++;

    SapXepDanhSachMatHang (String name, String type, float buy, float sell){
        this.name = name;
        this.type = type;
        profit = sell - buy;
    }

    public int compareTo (SapXepDanhSachMatHang x){
        return -Float.compare(this.profit, x.profit);
    }

    public String toString (){
        return id + " " + name + " " + type + " " + String.format("%.2f", profit);
    }
}

public class J05010 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        SapXepDanhSachMatHang a[] = new SapXepDanhSachMatHang[n];
        for (int i=0; i<n; i++){
            in.nextLine();
            String name = in.nextLine();
            String type = in.nextLine();
            float buy = in.nextFloat();
            float sell = in.nextFloat();
            a[i]= new SapXepDanhSachMatHang(name, type, buy, sell);
        }
        Arrays.sort(a);
        for (SapXepDanhSachMatHang i : a)
            System.out.println(i);
    }
        
}
