import java.util.Scanner;

public class JKT015 {  
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String temp = in.nextLine();
        StringBuilder s = new StringBuilder("");
        for (int i=0; i<temp.length(); i++){
            char c = temp.charAt(i);
            if (s.length()==0 && c!='>' && c!='<' && c!='-')
                s.append(c);
            else if (s.length()!=0){
                
            }
                
        }
    }
    
}