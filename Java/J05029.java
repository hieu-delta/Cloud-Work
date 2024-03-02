import java.util.Arrays;
import java.util.Scanner;

class DanhSachDoanhNghiep2 implements Comparable<DanhSachDoanhNghiep2>{
    String id, name;
    int number;
    DanhSachDoanhNghiep2 (String id, String name, int number){
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int compareTo(DanhSachDoanhNghiep2 x){
        int number_compare = Integer.compare(this.number, x.number);
        if (number_compare != 0)
            return -number_compare;
        else return (this.id.compareTo(x.id));
    }

    public String toString(){
        return id + " " + name + " " + number;
    }
}

public class J05029 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        DanhSachDoanhNghiep2 a[] = new DanhSachDoanhNghiep2[n];
        for (int i=0; i<n; i++){
            String id = in.nextLine();
            String name = in.nextLine();
            int number = in.nextInt();
            in.nextLine();
            a[i] = new DanhSachDoanhNghiep2(id, name, number);
        }
        Arrays.sort(a);
        int m = in.nextInt();
        for (int i=0; i<m; i++){
            int left = in.nextInt();
            int right = in.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + left + " DEN " + right + " SINH VIEN:");
            for (DanhSachDoanhNghiep2 x : a)
                if (x.number >= left && x.number <= right)
                    System.out.println(x);
        }
    }
}
