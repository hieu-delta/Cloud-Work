import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Studentxyz implements Comparable<Studentxyz>{
    static int stt=1;
    String name, id = "TS"+String.format("%02d",stt++), state;
    float point, nation, area, total;
    Studentxyz (String name, String point, String nation, String area){
        this.name = modify(name);
        this.point = Float.valueOf(point);
        if (nation.equals("Kinh"))
            this.nation = 0;
        else this.nation = 1.5f;
        if (area.equals("1"))
            this.area = 1.5f;
        else if (area.equals("2"))
            this.area = 1;
        else this.area = 0;
        state = calculate();
    }

    String calculate (){
        total = point+area+nation;
        if (total >= 20.5)
            return "Do";
        else return "Truot";
    }

    String modify (String name){
        name = name.trim().toUpperCase();
        String temp[] = name.split("\\s+"), tmp="";
        for (String i : temp)
            tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        return tmp.trim();
    }

    public int compareTo (Studentxyz x){
        int point_compare = Float.compare(this.total, x.total);
        if (point_compare != 0)
            return -point_compare;
        else return this.id.compareTo(x.id);
    }

    public String toString(){
        return id + " " + name + " " + total + " " + state;
    }

}

public class J07057 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("C:\\Users\\nguye\\Downloads\\PTIT\\Code\\Java\\Input\\THISINH.in.txt"));
        int n = Integer.valueOf(in.nextLine());
        Studentxyz a[] = new Studentxyz[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            String point = in.nextLine();
            String nation = in.nextLine();
            String area = in.nextLine();
            a[i] = new Studentxyz(name, point, nation, area);
        }
        Arrays.sort(a);
        for (Studentxyz i : a)
            System.out.println(i);
    }
}
