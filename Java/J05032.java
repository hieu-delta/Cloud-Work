import java.util.Arrays;
import java.util.Scanner;

class AgeCompare implements Comparable<AgeCompare>{
    String name;
    int day, month, year;

    AgeCompare (String name, String birth){
        this.name = modify(name);
        format(birth);
    }

    String modify (String name){
        name = name.trim().toUpperCase();
        String temp[] = name.split("\\s+"), tmp="";
        for (String i : temp)
            tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        return tmp.trim();
    }

    void format (String birth){
        String temp[] = birth.trim().split("/");
        day = Integer.valueOf(temp[0]);
        month = Integer.valueOf(temp[1]);
        year = Integer.valueOf(temp[2]);
    }

    public int compareTo (AgeCompare x){
        int year_compare = Integer.compare(this.year, x.year);
        int month_compare = Integer.compare(this.month, x.month);
        if (year_compare != 0)
            return year_compare;
        else if (month_compare != 0)
            return month_compare;
        else return Integer.compare(this.day, x.day);
    }

}

public class J05032 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        in.nextLine();
        AgeCompare a[] = new AgeCompare[n];
        for (int i=0; i<n; i++){
            String name = in.next();
            String birth = in.nextLine();
            a[i] = new AgeCompare(name, birth);
        }
        Arrays.sort(a);
        System.out.println(a[n-1].name);
        System.out.println(a[0].name);
    }
}
