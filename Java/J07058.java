import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MonThi implements Comparable<MonThi>{
    String id, name, method;
    MonThi (String id, String name, String method){
        this.id = id;
        this.name = name;
        this.method = method;
    }

    public int compareTo (MonThi x){
        return this.id.compareTo(x.id);
    }

    public String toString(){
        return id + " " + name + " " + method;
    }
}

public class J07058 {
    public static void main (String[] hihi) throws FileNotFoundException{
        Scanner in = new Scanner(new File("C:\\Users\\nguye\\Downloads\\PTIT\\Code\\Java\\Input\\MONHOC.in.txt"));
        ArrayList<MonThi> a = new ArrayList<MonThi>();
        in.nextLine();
        while(in.hasNextLine()==true){
            String id = in.nextLine();
            String name = in.nextLine();
            String method = in.nextLine();
            MonThi sub = new MonThi(id, name, method);
            a.add(sub);
        }
        Collections.sort(a);
        System.out.println(a.get(0));
        for (int i=1; i<a.size(); i++)
            if (a.get(i).id.equals(a.get(i-1).id)==false)
                System.out.println(a.get(i));
    }
}
