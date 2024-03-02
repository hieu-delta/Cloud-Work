import java.util.Scanner;

public class J01017 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] j01017){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            StringBuilder sb = new StringBuilder(s);
            int check=1;
            for (int i=0; i<sb.length()-1; i++)
                if (sb.charAt(i)!=sb.charAt(i+1)-2 && sb.charAt(i)!=sb.charAt(i+1)+2){
                    check=0;
                    break;
                }
            //System.out.println(count);
            if (check==1)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
