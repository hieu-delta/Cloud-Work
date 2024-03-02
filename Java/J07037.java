import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Company implements Comparable<Company>{
    String id, name, number;
    Company (String id, String name, String number){
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int compareTo(Company x){
        return this.id.compareTo(x.id);
    }

    public String toString(){
        return id + " " + name + " " + number;
    }
}

public class J07037 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DN.in.txt"));
        int n = Integer.valueOf(in.nextLine());
        Company a[] = new Company[n];
        for (int i=0; i<n; i++){
            String id = in.nextLine();
            String name = in.nextLine();
            String number = in.nextLine();
            
            a[i] = new Company(id, name, number);
        }
        Arrays.sort(a);
        for (Company i : a)
            System.out.println(i);
    }
}
