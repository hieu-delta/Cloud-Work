import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class J08021 {
    static Scanner in = new Scanner(System.in);
    static int check(String s){
        int count = 0;
        Stack<String> st = new Stack<>();
        st.push("-");
        // System.out.println(st + " count: " + count);
        for (int i=0; i<s.length(); i++){
            if (count > 0){
                try {
                    int temp = Integer.valueOf(st.peek());
                    st.pop();
                    st.push(Integer.toString(count+temp));
                } catch (Exception e) {
                    st.push(Integer.toString(count));
                }
                count = 0;
            }
            if (s.charAt(i)=='('){
                
                st.push(s.charAt(i)+"");
            }
            else{
                String c = st.pop();
                if (c.equals("(")){
                    count+=2;
                }
                else{
                    try {
                        // System.out.println("c: " + c);
                        int temp = Integer.valueOf(c);
                        if (st.peek().equals("(")){
                            count+=2;
                            st.pop();
                            count+=temp;
                        }
                        //st.push(Integer.toString(count+temp));
                        else {
                            st.push(Integer.toString(count+temp));
                            st.push("-");
                            count=0;
                        }
                    } catch (Exception e) {
                        st.push(Integer.toString(count));
                        st.push("-");
                        count=0;
                    }
                    // count = 0;
                } 
            }
            // System.out.println(st + " count: " + count);
        }
        try {
            int temp = Integer.valueOf(st.pop());
            st.push(Integer.toString(count+temp));
        } catch (Exception e) {
            st.push(Integer.toString(count));
        }
        // System.out.println(st + " count: " + count);
        ArrayList<Integer> a = new ArrayList<>();
        while(st.empty()==false)
            try {
                int temp = Integer.valueOf(st.pop());
                a.add(temp);
                //System.out.println(temp+" ");
            } catch (Exception e) {
            }
        Collections.sort(a);
        return a.get(a.size()-1);
    }
    public static void main(String[] args){
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            System.out.println(check(s));
        }
    }
}
