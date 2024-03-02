import java.util.Scanner;

public class J01003{
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        float a=in.nextFloat();
        float b=in.nextFloat();
        if (a==0 && b==0){
            System.out.println("VSN");
        }
        else if (a==0 && b!=0){
            System.out.println("VN");
        }
        else{
            float x=-b/a;
            System.out.printf("%.2f",x);
        }
    }
}