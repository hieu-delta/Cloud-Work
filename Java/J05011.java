import java.util.Arrays;
import java.util.Scanner;

class TinhGio implements Comparable<TinhGio>{
    String name, id;
    int hour, minute;
    TinhGio (String id, String name, String in, String out){
        this.id = id;
        this.name = modify(name);
        calculate(in,out);
    }

    String modify (String name){
        name = name.trim().toUpperCase();
        String temp[] = name.split("\\s+");
        name = "";
        for (String i : temp)
            name += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        return name;
    }

    void calculate (String in, String out){
        String temp1[] = in.split(":");
        String temp2[] = out.split(":");
        int timee = (Integer.valueOf(temp2[0])*60 + Integer.valueOf(temp2[1])) - (Integer.valueOf(temp1[0])*60 + Integer.valueOf(temp1[1]));
        hour = timee / 60;
        minute = timee - hour*60;
    }

    public int compareTo (TinhGio x){
        return -Integer.compare(this.hour*60 + this.minute, x.hour*60 + x.minute);
    }

    public String toString (){
        return id + " " + name + " " + hour + " gio " + minute + " phut";
    }
}

public class J05011 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        TinhGio a[] = new TinhGio[n];
        for (int i=0; i<n; i++){
            String id = in.nextLine();
            String name = in.nextLine();
            String time_in = in.nextLine();
            String time_out = in.nextLine();
            a[i] = new TinhGio(id, name, time_in, time_out);
        }
        Arrays.sort(a);
        for (TinhGio i : a)
            System.out.println(i);
    }
}
