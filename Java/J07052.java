import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Candidates implements Comparable<Candidates>{
    String name, area;
    float math, physic, chemistry, total, check[] = new float[]{0,0.5f,1.0f,2.5f}, extra;
    Candidates (String area, String name, String math, String physic, String chemistry){
        this.area = area;
        extra = check[area.charAt(2)-48];
        this.name = modify(name);
        this.math = Float.valueOf(math);
        this.physic = Float.valueOf(physic);
        this.chemistry = Float.valueOf(chemistry);
        total = this.math*2 + this.physic + this.chemistry + extra;
    }

    String modify (String name){
        name = name.trim().toUpperCase();
        String temp[] = name.split("\\s+"), tmp="";
        for (String i : temp)
            tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        return tmp.trim();
    }

    public int compareTo(Candidates x){
        return -Float.compare(this.total, x.total);
    }

    public String toString(){
        String extra_string, total_string;
        if (extra == (int) extra)
            extra_string = String.format("%.0f", extra);
        else extra_string = String.format("%.1f", extra);
        if (total == (int) total)
            total_string = String.format("%.0f", total);
        else total_string = String.format("%.1f", total);
        return area + " " + name + " " + extra_string + " " + total_string; 
    }

}

public class J07052 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("THISINH.in.txt"));
        int n = Integer.valueOf(in.nextLine()), target;
        float benchmark;
        Candidates a[] = new Candidates[n];
        for (int i=0; i<n; i++){
            String area = in.nextLine();
            String name = in.nextLine();
            String math = in.nextLine();
            String physic = in.nextLine();
            String chemistry = in.nextLine();
            a[i] = new Candidates(area, name, math, physic, chemistry);
        }
        target = Integer.valueOf(in.nextLine());
        Arrays.sort(a);
        benchmark = a[target-1].total;
        System.out.printf("%.1f \n",benchmark);
        for (Candidates i : a)
            if (i.total >= benchmark)
                System.out.println(i + " TRUNG TUYEN");
            else 
                System.out.println(i + " TRUOT");
    }
}
