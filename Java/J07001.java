import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner in = new Scanner(file);
        while(in.hasNext()==true){
            System.out.println(in.nextLine());
        }
        in.close();
    }

}
