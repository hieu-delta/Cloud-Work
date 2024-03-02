import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {
    static String modify(String s){
        s = s.trim();
        s = s.toUpperCase();
        String[] temp = s.split("\\s+");
        String tmp="";
        // for(int i=0; i<temp.length; i++){
        //     tmp = tmp + temp[i].charAt(0) + temp[i].substring(1).toLowerCase() + " ";
        // }
        for (String i : temp)
            tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        return tmp;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        String s="";
        while(s.equals("END")==false){
            s = in.nextLine();
            if (s.equals("END")==false)
                System.out.println(modify(s));
        }
    }
}
