import java.util.Scanner;

public class J03040 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] j03040){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            char[] a = s.toCharArray();
            int check=1, check68=1;
            if (a[5]==a[6] && a[6]==a[7] && a[9]==a[10])
                check=1;
            else
                for (int i=5; i<=10; i++){
                    if (i!=8){
                        if (a[i]!='6' && a[i]!='8')
                            check68=0;
                        if (a[i]<=a[i-1])
                            check=0;
                        if (i==9 && a[i]<=a[i-2])
                            check=0;
                    }
                }
            if (check==1)
                System.out.println("YES");
            else if (check==0 && check68==1)
                System.out.println("YES");
            else if (check==0 && check68==0)
                System.out.println("NO");
            System.out.println("check: "+check+" check 68: "+check68);
        }
    }
}
