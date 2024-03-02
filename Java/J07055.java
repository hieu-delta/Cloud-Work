import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Ranking implements Comparable<Ranking>{
    static int stt=1;
    String name, id="SV"+String.format("%02d",stt++), rank;
    Float mark1, mark2, mark3, avg;

    Ranking (String name, String mark1, String mark2, String mark3){
        this.name = modify(name);
        this.mark1 = Float.valueOf(mark1);
        this.mark2 = Float.valueOf(mark2);
        this.mark3 = Float.valueOf(mark3);
        avg = (this.mark1*25 + this.mark2*35 + this.mark3*40) / 100;
        rank = getRank(avg);
    }

    String modify (String name){
        name = name.trim().toUpperCase();
        String temp[] = name.split("\\s+"), tmp="";
        for (String i : temp)
            tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        return tmp.trim();
    }

    String getRank (Float avg){
        if (avg < 5)
            return "KEM";
        else if (5 <= avg && avg < 6.5)
            return "TRUNG BINH";
        else if (6.5 <= avg && avg < 8)
            return "KHA";
        else return "GIOI";
    }

    public int compareTo (Ranking x){
        return -Float.compare(this.avg, x.avg);
    }

    public String toString(){
        return id + " " + name + " " + String.format("%.2f",avg) + " " + rank;
    }
}

public class J07055 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("BANGDIEM.in.txt"));
        int n = Integer.valueOf(in.nextLine());
        Ranking a[] = new Ranking[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            String mark1 = in.nextLine();
            String mark2 = in.nextLine();
            String mark3 = in.nextLine();
            a[i] = new Ranking(name, mark1, mark2, mark3);
        }
        Arrays.sort(a);
        for (Ranking i : a)
            System.out.println(i);
    }
}
