import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SapXepTheoMaSinhVien implements Comparable<SapXepTheoMaSinhVien>{
    String id, name, classid, email;
    int course;

    SapXepTheoMaSinhVien (String id, String name, String classid, String email){
        this.id = id;
        this.name = name;
        this.classid = classid;
        this.email = email;
    }

    public int compareTo (SapXepTheoMaSinhVien x){
        return this.id.compareTo(x.id);
    }

    public String toString (){
        return id + " " + name + " " + classid + " " + email;
    }
}

public class J05021 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<SapXepTheoMaSinhVien> a = new ArrayList<>();
        while(in.hasNextLine()==true){
            String id = in.nextLine();
            String name = in.nextLine();
            String classid = in.nextLine();
            String email = in.nextLine();
            a.add(new SapXepTheoMaSinhVien(id, name, classid, email));
        }
        Collections.sort(a);
        for (SapXepTheoMaSinhVien i : a)
            System.out.println(i);
    }
}