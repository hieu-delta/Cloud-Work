import java.util.Scanner;

public class J01024 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] mama){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int check=1;
            for (int i=0; i<s.length(); i++)
                if (s.charAt(i)!='0' && s.charAt(i)!='1' && s.charAt(i)!='2'){
                    check=0;
                    break;
                }
            if (check==1)
                System.out.println("YES");
            else  System.out.println("NO");
        }
    }
}
