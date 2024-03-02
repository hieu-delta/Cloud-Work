import java.util.Scanner;

public class J03010 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] j03010){
        int n = in.nextInt();
        String[] s = new String[n+1];
        String[] name = new String[n+1];
        in.nextLine();
        for (int i=1; i<=n; i++){
            s[i] = in.nextLine();
            //get name
            String str =" " + s[i].toLowerCase(), temp="";
            name[i]="";
            for (int j=str.length()-1; j>=0; j--)
                if (str.charAt(j)!=' '){
                    temp+=str.charAt(j);
                    if (str.charAt(j-1)==' ')
                        break;
                }
            for (int j=temp.length()-1; j>=0; j--)
                name[i]+=temp.charAt(j);
            //get first charater of surname
            for (int j=0; j<str.length(); j++)
                if (str.charAt(j)!=' ' && str.charAt(j-1)==' ')
                    name[i]+=str.charAt(j);
            //remove redundant character 
            name[i]=name[i].substring(0,name[i].length()-1);   
            //number
        }
        for (int i=1; i<=n; i++){
            int d=1;
            for (int j=1; j<i; j++)
                if (name[j].equals(name[i])==true)
                    d++;
            if (d!=1)
                System.out.println(name[i]+d+"@ptit.edu.vn");
            else System.out.println(name[i]+"@ptit.edu.vn");
        }
    }
}


