import java.util.Arrays;
import java.util.Scanner;

class Timee {
    int hour, minute, second;
    Timee (int gio, int phut, int giay){
        hour = gio;
        minute = phut;
        second = giay;
    }

    String time="";
    String modify(){
        if (hour<10)
            time+="0"+Integer.toString(hour);
        else time+=Integer.toString(hour);
        // time+=" ";
        if (minute<10)
            time+="0"+Integer.toString(minute);
        else time+=Integer.toString(minute);
        // time+=" ";
        if (second<10)
            time+="0"+Integer.toString(second);
        else time+=Integer.toString(second);

        return time;
    }
}

public class J05033_classic {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] hihi){
        int n=in.nextInt(), gio, phut, giay;
        String[] a = new String[n];
        for (int i=0; i<n; i++){
            gio=in.nextInt();
            phut=in.nextInt();
            giay=in.nextInt();
            Timee t = new Timee(gio, phut, giay);
            a[i] = t.modify();
        }
        Arrays.sort(a);
        for (int i=0; i<n; i++){
            gio = Integer.valueOf(a[i].substring(0, 2));
            phut = Integer.valueOf(a[i].substring(2, 4));
            giay = Integer.valueOf(a[i].substring(4, 6));
            System.out.println(gio+" "+phut+" "+giay);
        }
    }
}

