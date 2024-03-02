import java.util.Scanner;

public class J03005{
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] j03004){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine(), s1="";
            s = " "+s+" ";
            int check=0;
            for (int i=1; i<s.length()-1; i++){
                if (s.charAt(i)!=' ')
                    if (s.charAt(i-1)==' ')
                        s1+=Character.toUpperCase(s.charAt(i));
                    else{
                        s1+=Character.toLowerCase(s.charAt(i));
                        if (s.charAt(i+1)==' ')
                            s1+=" ";
                    }
            }
            for (int i=1; i<s1.length(); i++)
                if (s1.charAt(i)!=' ' && s1.charAt(i-1)==' '){
                    check=i;
                    break;
                }
            for (int i=check; i<s1.length()-1; i++)  
                System.out.print(s1.charAt(i));
            System.out.print(", ");
            for (int i=0; i<check; i++)
                System.out.print(Character.toUpperCase(s1.charAt(i)));
            System.out.println();
            System.out.println(s1);
        }
    }
}