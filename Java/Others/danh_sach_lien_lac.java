package Others;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVienPtit implements Comparable<SinhVienPtit>{
    String id, name, class_id, email, phone;

    SinhVienPtit (String id, String name, String class_id, String email, String phone){
        this.id = id;
        this.name = name;
        this.class_id = class_id;
        this.email = email;
        this.phone = "0" + phone;
    }

    String modify (String name){
        name = name.trim().toUpperCase();
        String temp[] = name.split("\\s+"), tmp="";
        for (String i : temp)
            tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        return tmp.trim();
    }

    public int compareTo (SinhVienPtit x){
        int class_compare = this.class_id.compareTo(x.class_id);
        if (class_compare != 0)
            return class_compare;
        else return this.id.compareTo(x.id);
    }

    public String toString (){
        return id + " " + name + " " + class_id + " " + email + " " + phone;
    }
}

public class danh_sach_lien_lac {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DANHSACH.in.txt"));
        ArrayList<SinhVienPtit> a = new ArrayList<SinhVienPtit>();
        while(in.hasNextLine()){
            String id = in.nextLine();
            String name = in.nextLine();
            String class_id = in.nextLine();
            String email = in.nextLine();
            String phone = in.nextLine();
            SinhVienPtit ptiter = new SinhVienPtit(id, name, class_id, email, phone);
            a.add(ptiter);
        }
        Collections.sort(a);
        for (SinhVienPtit i : a)
            System.out.println(i);
    }
}
