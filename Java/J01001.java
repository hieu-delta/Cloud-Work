import java.util.Scanner;  // Import the Scanner class

public class J01001 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);  // Create a Scanner object
    int a = in.nextInt();  // Read user input
    int b = in.nextInt();
    in.close();
    if (a<=0 || b<=0){
        System.out.print("0");
    }
    else{
        int c = a+b;
        c=c*2;
        int s = a*b;
        System.out.print(c + " " + s);  // Output user input
    }
  }
}