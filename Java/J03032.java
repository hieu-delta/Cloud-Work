import java.util.Scanner;

public class J03032 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] mama){
        int t= in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            s = " " + s + " ";
            for (int i=0; i<s.length()-1; i++){
                if (s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                    int j=i+1;
                    String temp="";
                    while(s.charAt(j)!=' '){
                       temp+=s.charAt(j);
                       j++;
                    }
                    for (j=temp.length()-1; j>=0; j--)    
                        System.out.print(temp.charAt(j));
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
