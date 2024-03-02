import java.util.Arrays;
import java.util.Scanner;

class DanhSachThucTap2 implements Comparable<DanhSachThucTap2>{
    static int order = 1;
    String id, name, classid, email, company;
    int number;

    DanhSachThucTap2 (String id, String name, String classid, String email, String company){
        this.id = id;
        this.name = name;
        this.classid = classid;
        this.email = email;
        this.company = company;
        number = order++;
    }

    public int compareTo (DanhSachThucTap2 x){
        return this.id.compareTo(x.id);
    }

    public String toString (){
        return number + " " + id + " " + name + " " + classid + " " + email + " " + company;
    }
}

public class J05035 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        DanhSachThucTap2 a[] = new DanhSachThucTap2[n];
        for (int i=0; i<n; i++){
            String id = in.nextLine();
            String name = in.nextLine();
            String classid = in.nextLine();
            String email = in.nextLine();
            String company = in.nextLine();
            a[i] = new DanhSachThucTap2(id, name, classid, email, company);
        }
        Arrays.sort(a);
        int m = in.nextInt();
        in.nextLine();
        for (int i=0; i<m; i++){
            String temp = in.nextLine();
            for (DanhSachThucTap2 x : a)
                if (x.company.equals(temp))
                    System.out.println(x);
        }
    }
}