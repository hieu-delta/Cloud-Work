import java.util.Scanner;

public class J02007 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] mama){
        int t = in.nextInt();
        for(int k=1; k<=t; k++){
            int n = in.nextInt();
            int[] n1 = new int[101];
            int[] check = new int[100001];
            
            for (int i=1; i<=n; i++){
                n1[i] = in.nextInt();
                check[n1[i]]++;
            }
            System.out.println("Test " + k +":");
            for (int i=1; i<=n; i++){
                if (check[n1[i]]!=0){
                    System.out.println(n1[i] + " xuat hien " + check[n1[i]] + " lan");
                    check[n1[i]]=0;
                }
            }
        }
    }
}