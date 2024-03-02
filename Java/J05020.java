import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SapXepSinhVienTheoLop implements Comparable<SapXepSinhVienTheoLop>{
    String id, name, classid, email;
    int course;

    SapXepSinhVienTheoLop (String id, String name, String classid, String email){
        this.id = id;
        this.name = name;
        this.classid = classid;
        this.email = email;
    }

    public int compareTo (SapXepSinhVienTheoLop x){
        if (this.classid.compareTo(x.classid)!=0)
            return this.classid.compareTo(x.classid);
        return this.id.compareTo(x.id);
    }

    public String toString (){
        return id + " " + name + " " + classid + " " + email;
    }
}

public class J05020 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<SapXepSinhVienTheoLop> a = new ArrayList<>();
        int n = in.nextInt();
        in.nextLine();
        while(n-->0){
            String id = in.nextLine();
            String name = in.nextLine();
            String classid = in.nextLine();
            String email = in.nextLine();
            a.add(new SapXepSinhVienTheoLop(id, name, classid, email));
        }
        Collections.sort(a);
        for (SapXepSinhVienTheoLop i : a)
            System.out.println(i);
    }
}