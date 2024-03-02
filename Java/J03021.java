import java.util.Scanner;

public class J03021 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] j03021){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine(), temp="";
            s = s.toUpperCase();
            for (int i=0; i<s.length(); i++){
                char x=s.charAt(i);
                if (x=='A' || x=='B' || x=='C')
                    temp+="2";
                else if (x=='D' || x=='E' || x=='F')
                    temp+="3";
                else if (x=='G' || x=='H' || x=='I')
                    temp+="4";
                else if (x=='J' || x=='K' || x=='L')
                    temp+="5";
                else if (x=='M' || x=='N' || x=='O')
                    temp+="6";
                else if (x=='P' || x=='Q' || x=='R' || x=='S')
                    temp+="7";
                else if (x=='T' || x=='U' || x=='V')
                    temp+="8";
                else temp+="9";
            }
            int check=1, n=temp.length()-1;
            for (int i=0; i<=n/2; i++)
                if (temp.charAt(i)!=temp.charAt(n-i)){
                    check=0;
                    break;
                }
            if (check==1)
                System.out.println("YES");
            else System.out.println("NO");
            // System.out.println(temp);
        }
    }
}
