import java.util.Scanner;

class TimKiemGiangVien {
    static int order = 1;
    String name, subject, id = "GV" + String.format("%02d", order++);

    TimKiemGiangVien (String name, String subject){
        this.name = modify(name);
        this.subject = modify(subject);
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
        return id + " " + name + " " + shortname();
    }

}

public class J05027 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        TimKiemGiangVien a[] = new TimKiemGiangVien[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            String subject = in.nextLine();
            a[i] = new TimKiemGiangVien(name, subject);
        }
        int m = in.nextInt();
        in.nextLine();
        for (int i=0; i<m; i++){
            String temp = in.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + temp + ":");
            temp = temp.toLowerCase();
            for (TimKiemGiangVien x : a){
                String check = x.name.toLowerCase();
                if (check.contains(temp)==true)
                    System.out.println(x);
            }
        }
        
    }
}
