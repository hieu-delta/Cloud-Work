import java.util.Arrays;
import java.util.Scanner;

class SapXepDanhSachDoiTuongNhanVien implements Comparable<SapXepDanhSachDoiTuongNhanVien>{
    static int order = 1;
    String id, name, gender, birth, address, date;
    String taxid;

    SapXepDanhSachDoiTuongNhanVien (String id, String name, String gender, String birth, String address, String taxid, String date){
        this.id = String.format("%05d", order++);
        this.name = modify(name);
        this.gender = gender;
        this.birth = birth;
        this.address = address;
        this.taxid = taxid;
        this.date = date;
    }

    String modify (String name){
        String temp[] = name.trim().toUpperCase().split("\\s+");
        name = "";
        for (String i : temp){
            name += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        }
        return name.trim();
    }

    public int compareTo (SapXepDanhSachDoiTuongNhanVien x){
        String temp1[] = this.birth.split("/");
        String temp2[] = x.birth.split("/");
        int day1 = Integer.valueOf(temp1[0]), month1 = Integer.valueOf(temp1[1]), year1 = Integer.valueOf(temp1[2]);
        int day2 = Integer.valueOf(temp2[0]), month2 = Integer.valueOf(temp2[1]), year2 = Integer.valueOf(temp2[2]);
        if (year1 != year2)
            return Integer.compare(year1, year2);
        else if (month1 != month2)
            return Integer.compare(month1, month2);
        else 
            return Integer.compare(day1, day2); 
    }

    public String toString (){
        return id + " " + name + " " + gender + " " + birth + " " + address + " " + taxid + " " + date;
    }
}

public class J05007 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        SapXepDanhSachDoiTuongNhanVien a[] = new SapXepDanhSachDoiTuongNhanVien[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            String gender = in.nextLine();
            String birth = in.nextLine();
            String address = in.nextLine();
            String taxid = in.nextLine();
            String date = in.nextLine();
            a[i] = new SapXepDanhSachDoiTuongNhanVien(date, name, gender, birth, address, taxid, date);
        }
        Arrays.sort(a);
        for (SapXepDanhSachDoiTuongNhanVien i : a)
            System.out.println(i);
    }
}
