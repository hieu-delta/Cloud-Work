import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    static Scanner in = new Scanner(System.in);
    static int check(String s){
        Stack<Character> st = new Stack<>();
        st.push('o');
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='['){
                char c = s.charAt(i);
                st.push(c);
            }
            else if (s.charAt(i)=='{'){
                char c = s.charAt(i);
                st.push(c);
            }
            else if (s.charAt(i)=='('){
                char c = s.charAt(i);
                st.push(c);
            }
            else{
                if (s.charAt(i)==']')
                        if (st.peek()!='[')
                            return 0;
                        else st.pop();
                if (s.charAt(i)=='}')
                        if (st.peek()!='{')
                            return 0;
                        else st.pop();
                if (s.charAt(i)==')')
                        if (st.peek()!='(')
                            return 0;
                        else st.pop();     
            }
        }
        if (st.peek()=='o')
            return 1;
        else return 0;
    }
    static void test (String s){
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++)
            st.push(s.charAt(i));
        for (int i=0; i<s.length(); i++)
            System.out.print(st.pop()+" ");
    }
    public static void main(String[] args){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            //test(s);
            if (check(s)==1)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}