package Others;
import java.util.Scanner;
import java.util.Stack;

public class baitap5 {
    static Scanner in = new Scanner(System.in);
    static int operator (String x){
        switch (x){
            case "+" : return 1;
            case "-" : return 1;
            case "*" : return 1;
            case "/" : return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            String s[] = new String[n];
            for (int i=0; i<n; i++)
                s[i] = in.next();
            Stack<Long> st = new Stack<>();
            for (int i=n-1; i>=0; i--){
                if (operator(s[i])==1){
                    Long a = st.pop();
                    Long b = st.pop();
                    if (s[i].equals("+")==true)
                        st.push(a+b);
                    if (s[i].equals("-")==true)
                        st.push(a-b);
                    if (s[i].equals("*")==true)
                        st.push(a*b);
                    if (s[i].equals("/")==true)
                        st.push(a/b);
                }
                else    
                    st.push(Long.valueOf(s[i]));
            }
            System.out.println(st.pop());
        }
    }
}

