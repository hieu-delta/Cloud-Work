import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Tgian implements Comparable<Tgian>{
    int gio, phut, giay;
    Tgian(int hour, int minute, int second){
        gio = hour;
        phut = minute;
        giay = second;
    }
    public int compareTo(Tgian another){
        int hourCompare = Integer.compare(this.gio, another.gio);
        if (hourCompare!=0)
            return hourCompare;
        int minuteCompare = Integer.compare(this.phut, another.phut);
        if (minuteCompare!=0)
            return minuteCompare;
        int secondCompare = Integer.compare(this.giay,another.giay);
            return secondCompare;
    }
    public String toString() {
        return gio + " " + phut + " " + giay;
    }
}

public class J05033_arraylist {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        int gio, phut, giay;
        ArrayList<Tgian> t = new ArrayList<Tgian>();
        for (int i=0; i<n; i++){
            gio = in.nextInt();
            phut = in.nextInt();
            giay = in.nextInt();
            Tgian time = new Tgian(gio, phut, giay);
            t.add(time);
        }
        Collections.sort(t);
        for (Tgian i : t)
            System.out.println(i);
    }
}
