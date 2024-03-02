import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class SvPtit implements Comparable<SvPtit>{
    static int stt=1;
    String name, id="SV"+String.format("%02d",stt++);
    float mark1, mark2, mark3, avg;
    int rank;

    SvPtit (String name, String mark1, String mark2, String mark3){
        this.name = modify(name);
        this.mark1 = Float.valueOf(mark1);
        this.mark2 = Float.valueOf(mark2);
        this.mark3 = Float.valueOf(mark3);
        avg = (this.mark1*3 + this.mark2*3 + this.mark3*2) / 8;
    }


    String modify (String name){
        name = name.trim().toUpperCase();
        String temp[] = name.split("\\s+"), tmp="";
        for (String i : temp)
            tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        return tmp.trim();
    }

    public int compareTo (SvPtit x){
        int avg_compare = Float.compare(this.avg, x.avg);
        if (avg_compare != 0)
            return -avg_compare;
        else return this.id.compareTo(x.id);
    }

    public String toString (){
        return id + " " + name + " " + String.format("%.2f", avg) + " " + rank;
    }

}

public class J07054 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("BANGDIEM.in.txt"));
        int n = Integer.valueOf(in.nextLine());
        SvPtit a[] = new SvPtit[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            String mark1 = in.nextLine();
            String mark2 = in.nextLine();
            String mark3 = in.nextLine();
            a[i] = new SvPtit(name, mark1, mark2, mark3);
        }
        Arrays.sort(a);
        a[0].rank=1;
        for (int i=1; i<n; i++){
            if (a[i].avg == a[i-1].avg)
                a[i].rank = a[i-1].rank;
            else a[i].rank = i+1;
        }

        for (SvPtit i : a)
            System.out.println(i);
    }
}
