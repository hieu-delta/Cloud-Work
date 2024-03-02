import java.util.Arrays;
import java.util.Scanner;

class BangDiemThanhPhan2 implements Comparable<BangDiemThanhPhan2>{
    String id, name, classid;
    Float mark1, mark2, mark3;

    BangDiemThanhPhan2 (String id, String name, String classid, Float mark1, Float mark2, Float mark3){
        this.id = id;
        this.name = modify(name);
        this.classid = classid;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int compareTo (BangDiemThanhPhan2 x){
        return this.name.compareTo(x.name);
    }

    String modify (String name){
        name = name.trim().toUpperCase();
        String temp[] = name.split("\\s+"), tmp="";
        for (String i : temp)
            tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        return tmp.trim();
    }

    public String toString(){
        return id + " " + name + " " + classid + " " + String.format("%.1f", mark1) + " " + String.format("%.1f", mark2) + " " + String.format("%.1f", mark3);
    }

}

public class J05031 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        BangDiemThanhPhan2 a[] = new BangDiemThanhPhan2[n];
        for (int i=0; i<n; i++){
            String id = in.nextLine();
            String name = in.nextLine();
            String classid = in.nextLine();
            Float mark1 = in.nextFloat();
            Float mark2 = in.nextFloat();
            Float mark3 = in.nextFloat();
            in.nextLine();
            a[i] = new BangDiemThanhPhan2(id, name, classid, mark1, mark2, mark3);
        }
        Arrays.sort(a);
        for (int i=0; i<n; i++){
            System.out.print(i+1+" ");
            System.out.println(a[i]);
        }
    }
}