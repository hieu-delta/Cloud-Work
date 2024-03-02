import java.util.Scanner;

class LietKeSinhVienTheoLop {
    String id, name, classid, email;
    int course;

    LietKeSinhVienTheoLop (String id, String name, String classid, String email){
        this.id = id;
        this.name = name;
        this.classid = classid;
        this.email = email;
    }

    public String toString (){
        return id + " " + name + " " + classid + " " + email;
    }
}

public class J05022 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        LietKeSinhVienTheoLop a[] = new LietKeSinhVienTheoLop[n];
        for (int i=0; i<n; i++){
            String id = in.nextLine();
            String name = in.nextLine();
            String classid = in.nextLine();
            String email = in.nextLine();
            a[i] = new LietKeSinhVienTheoLop(id, name, classid, email);
        }
        int m = in.nextInt();
        in.nextLine();
        for (int i=0; i<m; i++){
            String classid = in.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + classid + ":");
            for (LietKeSinhVienTheoLop x : a)
                if (x.classid.equals(classid))
                    System.out.println(x);
        }
    }
}