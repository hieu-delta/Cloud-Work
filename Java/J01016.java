import java.util.Scanner;

public class J01016 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] j01016){
        String s = in.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int count=0;
        for (int i=0; i<sb.length(); i++)
            if (sb.charAt(i)=='4' || sb.charAt(i)=='7')
                count++;
        //System.out.println(count);
        if (count==4 || count==7)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
