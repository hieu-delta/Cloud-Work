import java.util.Scanner;

class DanhSachGiangVien {
    static int order = 1;
    String name, subject, acronym, id = "GV" + String.format("%02d", order++);

    DanhSachGiangVien (String name, String subject){
        this.name = modify(name);
        this.subject = modify(subject);
        acronym = shortname();
    }

    String modify (String name){
        name = name.trim().toUpperCase();
        String temp[] = name.split("\\s+"), tmp="";
        for (String i : temp)
            tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        return tmp.trim();
    }

    String shortname(){
        String temp = subject.charAt(0) + "";
        for (int i=1; i<subject.length(); i++)
            if (subject.charAt(i)!=' ' && subject.charAt(i-1)==' ')
                temp += subject.charAt(i);
        return temp;
    }

    public String toString(){
        return id + " " + name + " " + acronym;
    }

}

public class J05026 {
    static Scanner in = new Scanner(System.in);
    static String modify (String subject){
        subject = subject.trim().toUpperCase();
        String temp[] = subject.split("\\s+"), tmp="";
        for (String i : temp)
            tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        
        String str = tmp.charAt(0) + "";
        for (int i=1; i<tmp.length(); i++)
            if (tmp.charAt(i)!=' ' && tmp.charAt(i-1)==' ')
                str += tmp.charAt(i);
        return str;
    }
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        DanhSachGiangVien a[] = new DanhSachGiangVien[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            String subject = in.nextLine();
            a[i] = new DanhSachGiangVien(name, subject);
        }
        int m = in.nextInt();
        in.nextLine();
        for (int i=0; i<m; i++){
            String query = in.nextLine();
            query = modify(query);
            System.out.println("DANH SACH GIANG VIEN BO MON " + query + ":");
            for (DanhSachGiangVien x : a){
                if (query.equals(x.acronym)==true)
                    System.out.println(x);
            }
        }
        
    }
}
