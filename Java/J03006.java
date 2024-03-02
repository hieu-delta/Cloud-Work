import java.util.Scanner;

public class J03006 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] j03006){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int n = (s.length()-1), check=1;
            for (int i=0; i<=n/2; i++)
                if (s.charAt(i)!=s.charAt(n-i) || Character.getNumericValue(s.charAt(i))%2!=0){
                    check=0;
                    break;
                }
            if (check==1)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
