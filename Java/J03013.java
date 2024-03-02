import java.util.Scanner;

public class J03013 {
    public static Scanner in =new Scanner(System.in);
    public static void main(String[] j03013){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s1 = in.next();
            String s2 = in.next();
            if (s1.length()<s2.length()){
                String temp=s1;
                s1=s2;
                s2=temp;
            }
            else if (s1.length()==s2.length()){
                int check=1, n=s1.length();
                for (int i=0; i<n; i++)
                    if (s1.charAt(i)>s2.charAt(i)){
                        check=1;
                        break;
                    }
                    else if (s1.charAt(i)<s2.charAt(i)){
                        check=0;
                        break;
                    }
                    if (check==0){
                        String temp=s1;
                        s1=s2;
                        s2=temp;
                    }
            }
            int l=s1.length(), d=0;
            int[] n1 = new int[l], n2 = new int[l], n3 = new int[l];
            for (int i=0; i<l; i++){
                n1[i] = s1.charAt(i)-48;
                if (i>=l-s2.length())
                    n2[i] = s2.charAt(i-(l-s2.length()))-48;
            }
            for (int i=l-1; i>=0; i--){
                n2[i]+=d;
                d=0;
                if (n1[i]>=n2[i])
                    n3[i]=n1[i]-n2[i];
                else{
                    d++;
                    n3[i]=10+n1[i]-n2[i];
                }
            }
            for (int i=0; i<l; i++)
                System.out.print(n3[i]);
            System.out.println();
        }
    }
}