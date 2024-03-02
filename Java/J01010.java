import java.util.Scanner;

public class J01010 {
    public static Scanner in = new Scanner(System.in);
    public static void main (String[] mama){
        int t = in.nextInt();
        while(t-->0){
            long n = in.nextLong();
            String s = String.format("%d", n), s1="";
            int check = 1;
            for (int i=0; i<s.length(); i++)
                if (s.charAt(i)=='1')
                    s1+="1";
                else if (s.charAt(i)=='8' || s.charAt(i)=='9' || s.charAt(i)=='0')
                    s1+="0";
                else{
                    check=0;
                    break;
                }
            if (s1=="")
                check=0;
            else{
                StringBuilder sb = new StringBuilder(s1);
                while(sb.charAt(0)=='0' && sb.length()>1)
                    sb.deleteCharAt(0);
                if (sb.charAt(0)=='0')
                    check=0;
                else 
                    System.out.println(sb);
            }

            if (check==0) 
                System.out.println("INVALID");
        }
    }
}
