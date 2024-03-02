import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(in.hasNext()==true){
            String s = in.next();
            try {
                sum += Integer.valueOf(s);
            } catch (Exception e) {
            }
        }
        System.out.println(sum);
    }    
}
