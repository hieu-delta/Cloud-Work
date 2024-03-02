import java.util.Arrays;
import java.util.Scanner;

class ThoiGian implements Comparable<ThoiGian>{
    int t, h, m ,s;
    ThoiGian(int gio, int phut, int giay){
        h = gio;
        m = phut;
        s = giay;
    }
    public int compareTo(ThoiGian another){
        int hourCompare = Integer.compare(this.h, another.h);
        if (hourCompare!=0)
            return hourCompare;
        int minuteCompare = Integer.compare(this.m, another.m);
        if (minuteCompare!=0)
            return minuteCompare;
        int secondCompare = Integer.compare(this.s,another.s);
            return secondCompare;
    }
    public String toString() {
        return h + " " + m + " " + s;
    }
}

public class J05033 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        int gio, phut, giay;
        ThoiGian[] t = new ThoiGian[n];
        for (int i=0; i<n; i++){
            gio = in.nextInt();
            phut = in.nextInt();
            giay = in.nextInt();
            t[i] = new ThoiGian(gio,phut,giay);
        }
        Arrays.sort(t);
        for (int i=0; i<n; i++)
            System.out.println(t[i]);
    }
}