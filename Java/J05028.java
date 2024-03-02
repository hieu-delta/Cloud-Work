import java.util.Arrays;
import java.util.Scanner;

class DanhSachDoanhNghiep1 implements Comparable<DanhSachDoanhNghiep1>{
    String id, name;
    int number;
    DanhSachDoanhNghiep1 (String id, String name, int number){
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int compareTo(DanhSachDoanhNghiep1 x){
        int number_compare = Integer.compare(this.number, x.number);
        if (number_compare != 0)
            return -number_compare;
        else return (this.id.compareTo(x.id));
    }

    public String toString(){
        return id + " " + name + " " + number;
    }
}

public class J05028 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        DanhSachDoanhNghiep1 a[] = new DanhSachDoanhNghiep1[n];
        for (int i=0; i<n; i++){
            String id = in.nextLine();
            String name = in.nextLine();
            int number = in.nextInt();
            in.nextLine();
            a[i] = new DanhSachDoanhNghiep1(id, name, number);
        }
        Arrays.sort(a);
        for (DanhSachDoanhNghiep1 i : a)
            System.out.println(i);
    }
}
