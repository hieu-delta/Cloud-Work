import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Subject implements Comparable<Subject>{
    String id, name, credit;
    Subject (String id, String name, String credit){
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public int compareTo (Subject x){
        return this.name.compareTo(x.name);
    }

    public String toString(){
        return id + " " + name + " " + credit;
    }
}

public class J07043 {
    public static void main (String[] hihi) throws FileNotFoundException{
        Scanner in = new Scanner(new File("MONHOC.in.txt"));
        int n = Integer.valueOf(in.nextLine());
        Subject a[] = new Subject[n];
        for (int i=0; i<n; i++){
            String id = in.nextLine();
            String name = in.nextLine();
            String credit = in.nextLine();
            a[i] = new Subject(id, name, credit);
        }
        Arrays.sort(a);
        for (Subject i : a)
            System.out.println(i);
    }
}
