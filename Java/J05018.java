import java.util.Arrays;
import java.util.Scanner;

class BangDiemHocSinh implements Comparable<BangDiemHocSinh>{
    static int order = 1;
    String name, id = "HS"+String.format("%02d", order++), rank;
    float avg;
    
    BangDiemHocSinh (String name, float total){
        this.name = modify(name);
        this.avg = total/12;
        avg = Math.round(avg * 10) / 10;
        if (avg < 5)
            rank = "YEU";
        else if (avg < 7) 
            rank = "TB";
        else if (avg < 8)
            rank = "KHA";
        else if (avg < 9)
            rank = "GIOI";
        else rank = "XUAT SAC";
    }

    String modify (String name){
        name = name.trim().toUpperCase();
        String temp[] = name.split("\\s+"), tmp="";
        for (String i : temp)
            tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        return tmp.trim();
    }

    public int compareTo (BangDiemHocSinh x){
        int mark_compare = Float.compare(this.avg, x.avg);
        if (mark_compare != 0)
            return -mark_compare;
        else return this.id.compareTo(x.id);
    }

    public String toString(){
        return id + " " + name + " " + String.format("%.1f", avg) + " " + rank;
    }
}

public class J05018 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        BangDiemHocSinh a[] = new BangDiemHocSinh[n];
        for (int i=0; i<n; i++){
            in.nextLine();
            String name = in.nextLine();
            float total=0;
            for (int j=0; j<10; j++){
                float temp = in.nextFloat();
                if (j==0 || j==1)
                    total += temp*2;
                else total += temp;
            }
            a[i] = new BangDiemHocSinh(name, total);
        }
        Arrays.sort(a);
        for (BangDiemHocSinh i : a)
            System.out.println(i);
    }
}