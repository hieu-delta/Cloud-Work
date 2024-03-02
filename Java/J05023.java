import java.util.Scanner;

class LietKeSinhVienTheoKhoa {
    String id, name, classid, email;
    int course;

    LietKeSinhVienTheoKhoa (String id, String name, String classid, String email){
        this.id = id;
        this.name = name;
        this.classid = classid;
        this.email = email;
        course = Integer.valueOf(""+this.classid.charAt(1)+this.classid.charAt(2));
    }

    public String toString (){
        return id + " " + name + " " + classid + " " + email;
    }
}

public class J05023 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        LietKeSinhVienTheoKhoa a[] = new LietKeSinhVienTheoKhoa[n];
        for (int i=0; i<n; i++){
            String id = in.nextLine();
            String name = in.nextLine();
            String classid = in.nextLine();
            String email = in.nextLine();
            a[i] = new LietKeSinhVienTheoKhoa(id, name, classid, email);
        }
        int m = in.nextInt();
        in.nextLine();
        for (int i=0; i<m; i++){
            int temp = in.nextInt();
            System.out.println("DANH SACH SINH VIEN KHOA " + temp + ":");
            temp = temp%100;
            for (LietKeSinhVienTheoKhoa x : a)
                if (x.course == temp)
                    System.out.println(x);
        }
    }
}