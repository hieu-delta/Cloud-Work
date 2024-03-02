import java.util.Scanner;

public class J03026 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] j03026){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s1 = in.nextLine(), s2 = in.nextLine();
            if (s1.length()==s2.length()){
                if (s1.equals(s2)!=true)
                    System.out.println(s1.length());
                else 
                    System.out.println(-1);
            } 
            else if (s1.length()>s2.length())
                System.out.println(s1.length());
            else if (s1.length()<s2.length())
                System.out.println(s2.length());
        }
    }
}
