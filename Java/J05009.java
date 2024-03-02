import java.util.Arrays;
import java.util.Scanner;

class ThuKhoa implements Comparable<ThuKhoa>{
    static int order = 1;
    String name, date;
    float mark;
    int id;

    ThuKhoa (String name, String date, float mark){
        this.name = name;
        this.date = date;
        this.mark = Math.round(mark*10)/10f;
        id = order++;
    }

    public int compareTo (ThuKhoa x){
        int mark_compare = Float.compare(this.mark, x.mark);
        if (mark_compare != 0)
            return -mark_compare;
        else 
            return Integer.compare(this.id, x.id);
    }

    public String toString (){
        return id + " " + name + " " + date + " " + String.format("%.1f", mark);
    }
}

public class J05009 {
    static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        ThuKhoa a[] = new ThuKhoa[n];
        for (int i=0; i<n; i++){
            in.nextLine();
            String name = in.nextLine();
            String date = in.nextLine();
            float total = 0;
            for (int j=0; j<3; j++){
                float temp = in.nextFloat();
                total += temp;
            }
            a[i] = new ThuKhoa(name, date, total);
        }
        Arrays.sort(a);
        System.out.println(a[0]);
        for (int i=1; i<n; i++)
            if (a[i].mark == a[i-1].mark)
                System.out.println(a[i]);
            else
                break;
        
    }
}
