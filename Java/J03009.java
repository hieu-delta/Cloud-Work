import java.util.Arrays;
import java.util.Scanner;

public class J03009 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] j03009){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            String[] list = new String[101];
            int d=0;
            s1 = " " + s1 + " ";
            for (int i=0; i<s1.length()-1; i++){
                String check="";
                if (s1.charAt(i)==' '){
                    int j=i+1;
                    while(s1.charAt(j)!=' '){
                        check+=s1.charAt(j);
                        j++;
                    }
                    // System.out.print(check+" ");
                    if (s2.indexOf(check)==-1){
                        list[d]=check;
                        d++;
                    }
                }
            }
            Arrays.sort(list,0,d);
            list[d]="0";
            for (int i=0; i<d; i++)
                if (list[i].equals(list[i+1])!=true)
                    System.out.print(list[i]+" ");
            System.out.println();
        }
    }
}
