import java.util.Scanner;

public class J03008 {
    public static Scanner in = new Scanner(System.in);
    public static int[] sonto = new int[]{0,0,1,1,0,1,0,1,0,0,0};
    public static void main(String[] j03007){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int n = (s.length()-1), check=1;
            for (int i=0; i<=n/2; i++){
                int a = Character.getNumericValue(s.charAt(i));
                if (s.charAt(i)!=s.charAt(n-i) || sonto[a]==0){
                    check=0;
                    break;
                }
            }
            if (check==1)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
