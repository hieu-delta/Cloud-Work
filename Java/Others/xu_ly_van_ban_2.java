package Others;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class xu_ly_van_ban_2 {
    static int check (String s){
        int check=0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                check = 1;
                break;
            }
        }
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='.' || s.charAt(i)==',' || s.charAt(i)=='!' || s.charAt(i)=='?' || s.charAt(i)==':'){
                check = 0;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("VANBAN.in"));
        ArrayList<String> a = new ArrayList<>();
        while(in.hasNext()==true){
            String temp = in.next();
            if (check(temp)==1)
                a.add(temp);
        }
        Collections.sort(a);
        System.out.println(a.get(0));
        for (int i=1; i<a.size(); i++)
            if (a.get(i).equals(a.get(i-1))==false)
                System.out.println(a.get(i));     
    }
}
