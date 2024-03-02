package Others;
import java.util.Scanner;

class User {
    String username, password;
    int count=0;
    User (String username, String password){
        this.username = username;
        this.password = password;
    }

}

public class lop_usser {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        User a[] = new User[n];
        for (int i=0; i<n; i++){
            String username = in.next();
            String password = in.next();
            a[i] = new User(username, password);
        }
        int m = in.nextInt();
        for (int i=0; i<m; i++){
            String username = in.next();
            String password = in.next();
            for (int j=0; j<n; j++)
                if (username.equals(a[j].username)){
                    if (password.equals(a[j].password))
                        a[j].count++;
                }
        } 
        for (User i : a)
            System.out.println(i.count);
    }
}
