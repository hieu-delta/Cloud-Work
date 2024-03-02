import java.util.Arrays;
import java.util.Scanner;

public class J03015 {
    public static Scanner in = new Scanner(System.in);
    public static String convert(String s){
        String temp="";
        int j=0;
        while(s.charAt(j)=='0' && j<s.length()-1)
            j++;
        if (j==s.length())
            return "0";
        for (int i=s.length()-1; i>=j; i--)
            temp+=s.charAt(i);
        return temp;
    }
    public static int[] reverse(int[] a, int n){
        int[] temp = new int[n];
        for (int i=0; i<n; i++)
            temp[n-i-1]=a[i];
        return temp;
    }
    public static void main(String[] j03013){
        int t = 1;
        while(t-->0){
            //input
            String s1 = in.nextLine(), s2 = in.nextLine();
            s1 = convert(s1);
            s2 = convert(s2);
            // System.out.println(s1);
            // System.out.println(s2);

            //compare
            int l1=s1.length(), l2=s2.length(), check=1; //s1>s2
            if (l1<l2)
                check=0;
            else 
                if (l1==l2){
                    for (int i=l1-1; i>=0; i--)
                        if (s1.charAt(i)>s2.charAt(i))
                            break;
                        else if (s2.charAt(i)>s1.charAt(i)){
                            check=0;
                            break;
                        }
                }
            if (check==0){
                String temp=s1;
                s1=s2;
                s2=temp;
                int tmp=l1;
                l1=l2;
                l2=tmp;
            }
            //initialize
            int max=Math.max(l1,l2);
            // System.out.println("max-"+max);
            int[] n1 = new int[max], n2 = new int[max], n3 = new int[max];
            for (int i=0; i<max; i++){
                if (i<l1)
                    n1[i]=s1.charAt(i)-48;
                else n1[i]=0;

                if (i<l2)
                    n2[i]=s2.charAt(i)-48;
                else n2[i]=0;
            }
            n1=reverse(n1,max);
            n2=reverse(n2,max);
            //calculate
            int d=0;
            for (int i=max-1; i>=0; i--){
                n2[i]+=d;
                d=0;
                if (n1[i]>=n2[i])
                    n3[i]=n1[i]-n2[i];
                else{
                    d++;
                    n3[i]=10+n1[i]-n2[i];
                }
            }
            //display
            // for (int i=0; i<max; i++)
            //     System.out.print(n1[i]);
            // System.out.println();
            // for (int i=0; i<max; i++)
            //     System.out.print(n2[i]);
            // System.out.println();
            if (Arrays.equals(n1,n2)==true)
                System.out.print(0);
            else{
                int j=0;
                while(n3[j]==0)
                    j++;
                if (check==0)
                    System.out.print("-");
                for (int i=j; i<max; i++)
                    System.out.print(n3[i]);
            }
            System.out.println();
        }
    }
}
