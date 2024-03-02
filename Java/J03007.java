import java.util.Scanner;

public class J03007 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] j03007){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int n = (s.length()-1), check=1,sum=0;
            for (int i=0; i<=n/2; i++)
                if (s.charAt(i)!=s.charAt(n-i)){
                    check=0;
                    break;
                }
                else sum+=Character.getNumericValue(s.charAt(i));
            if (n%2==0)
                sum-=Character.getNumericValue(s.charAt(n/2));
            if ((sum*2)%10!=0)
                check=0;
            if (s.charAt(0)!='8' && s.charAt(s.length()-1)!='8')
                check=0;
            if (check==1)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
