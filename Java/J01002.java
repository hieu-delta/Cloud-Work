import java.util.Scanner;  // Import the Scanner class

public class J01002{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0){
            long n = in.nextLong();
            long ss=0;
            ss=n*(n+1)/2;
            System.out.println(ss);
        }
        in.close();
   }
}