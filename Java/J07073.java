import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class GiangDay implements Comparable<GiangDay>{
    String id, name, credit, teach, practice;
    GiangDay (String id, String name, String credit, String teach, String practice){
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.teach = teach;
        this.practice = practice;
    }

    public int compareTo (GiangDay x){
        return this.id.compareTo(x.id);
    }

    public String toString() {
        return id + " " + name + " " + credit + " " + teach + " " + practice;
    }
}

public class J07073 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Input/MONHOC.in.txt"));
        int n = Integer.valueOf(in.nextLine());
        GiangDay a[] = new GiangDay[n];
        for (int i=0; i<n; i++){
            String id = in.nextLine();
            String name = in.nextLine();
            String credit = in.nextLine();
            String teach = in.nextLine();
            String practice = in.nextLine();
            a[i] = new GiangDay(id, name, credit, teach, practice);
        }
        Arrays.sort(a);
        for (GiangDay i : a)
            if (i.practice.equals("Truc tiep")==false)
                System.out.println(i);
    }
}
