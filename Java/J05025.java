import java.util.Arrays;
import java.util.Scanner;

class SapXepGiangVien implements Comparable<SapXepGiangVien>{
    static int order = 1;
    String name, subject, acronym, id = "GV" + String.format("%02d", order++);

    SapXepGiangVien (String name, String subject){
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

    public int compareTo (SapXepGiangVien x){
        String temp1[] = this.name.split(" ");
        String temp2[] = x.name.split(" ");
        int name_compare = temp1[temp1.length-1].compareTo(temp2[temp2.length-1]);
        if (name_compare != 0)
            return name_compare;
        else return this.id.compareTo(x.id);
    }

    public String toString(){
        return id + " " + name + " " + acronym;
    }
}

public class J05025 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        SapXepGiangVien a[] = new SapXepGiangVien[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            String subject = in.nextLine();
            a[i] = new SapXepGiangVien(name, subject);
        }
        Arrays.sort(a);
        for (SapXepGiangVien i : a)
            System.out.println(i);
    }
}
