import java.util.Scanner;

public class J03025 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] j03025){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int dem=0, n=s.length()-1;
            for (int i=0; i<=n/2; i++)
                if (dem>1)
                    break;
                else if (s.charAt(i)!=s.charAt(n-i)){
                    dem++;
                    // System.out.println(i);
                }
            if (dem==0 && s.length()%2==0)
                System.out.println("NO");
            else if (dem>1)
                System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
