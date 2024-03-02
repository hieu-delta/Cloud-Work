import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<String> s = new ArrayList<>();
        while(in.hasNext()){
            String temp=in.next();
            try {
                Integer.valueOf(temp);
            }
            catch (Exception e){
                s.add(temp);
            }
        }
        Collections.sort(s);
        for (String i : s)
            System.out.print(i+" ");
    }
}
