import java.util.Scanner;

class LietKeSinhVien{
    String id, name, classid, email;

    LietKeSinhVien (String id, String name, String classid, String email){
        this.id = id;
        this.name = name;
        this.classid = classid;
        this.email = email;
    }

    public String toString (){
        return id + " " + name + " " + classid + " " + email;
    }
}

public class J05024 {
    static Scanner in = new Scanner(System.in);
    static String format (String s){
        s = s.trim().toUpperCase();
        String temp[] = s.split("\\s+");
        // s="";
        // for (String i : temp)
        //     s += i.charAt(0);
        s = "" + temp[0].charAt(0) + temp[1].charAt(0);
        return s;
    }
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        LietKeSinhVien a[] = new LietKeSinhVien[n];
        for (int i=0; i<n; i++){
            String id = in.nextLine();
            String name = in.nextLine();
            String classid = in.nextLine();
            String email = in.nextLine();
            a[i] = new LietKeSinhVien(id, name, classid, email);
        }
        int m = in.nextInt();
        in.nextLine();
        for (int i=0; i<m; i++){
            String temp = in.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + temp.toUpperCase()+ ":");
            temp = format(temp);
            //System.out.println(temp);
            for (LietKeSinhVien x : a)
                if (x.id.contains(temp))
                    if (x.classid.charAt(0)!='E')
                        System.out.println(x);
                    else {
                        if (temp.equals("CN")==false && temp.equals("AT")==false)
                            System.out.println(x);
                    }
        }
    }
}