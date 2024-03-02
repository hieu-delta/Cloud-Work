import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class DSSV implements Comparable<DSSV>{
    String name, firstname="", lastname, id, sdt, mail;
    DSSV (String id, String name, String sdt, String mail){
        this.id = id;
        this.name = modify(name);
        this.sdt = sdt;
        this.mail = mail;
    }

    String modify(String name){
        String temp[] = name.trim().toUpperCase().split("\\s+"), tmp="";
        for (int i=0; i<temp.length; i++){
            if (i != temp.length-1)
                firstname += temp[i] + " ";
            else lastname = temp[i];
            tmp+=temp[i].charAt(0) + temp[i].substring(1).toLowerCase() + " ";
        }
        return tmp.trim();
    }

    public int compareTo (DSSV x){
        int lastname_compare = this.lastname.compareTo(x.lastname);
        int firstname_compare = this.firstname.compareTo(x.firstname);
        if (lastname_compare != 0)
            return lastname_compare;
        else if (firstname_compare != 0)
            return firstname_compare;
        else return this.id.compareTo(x.id);
    }

    public String toString() {
        return id + " " + name + " " + sdt + " " + mail;
    }
}

public class J07081 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Input/SINHVIEN.in"));
        int n = Integer.valueOf(in.nextLine());
        DSSV a[] = new DSSV[n];
        for (int i=0; i<n; i++){
            String id = in.nextLine();
            String name = in.nextLine();
            String sdt = in.nextLine();
            String mail = in.nextLine();
            a[i] = new DSSV(id, name, sdt, mail);
        }
        Arrays.sort(a);
        for (DSSV i : a)
            System.out.println(i);
    }
}
