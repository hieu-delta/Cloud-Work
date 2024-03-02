import java.util.Scanner;

public class J03024 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] j03024){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int check=1;
            if (s.charAt(0)<49 || s.charAt(0)>57)
                check=-1;
            else{
                int chan=0, le=0;
                for (int i=0; i<s.length(); i++)
                    if (s.charAt(i)<48 || s.charAt(i)>57){
                        check=-1;
                        break;
                    }
                    else if (s.charAt(i)%2==0)
                        chan++;
                    else le++;
                if (chan==le)
                    check=0;
                else if (chan<le && s.length()%2==0)
                    check=0;
                else if (chan>le && s.length()%2!=0)
                    check=0;
            }
            if (check==-1)
                System.out.println("INVALID");
            else if (check==1)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
