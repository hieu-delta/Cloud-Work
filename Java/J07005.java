import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class J07005 {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        int check[] = new int[1001];
        for (int i=0; i<100000; i++)
            check[in.readInt()]++;
        for (int i=0; i<1000; i++)
            System.out.println(i + " " + check[i]);
        in.close();
    }
}
