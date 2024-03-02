import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LoaiPhong implements Comparable<LoaiPhong>{
    String type, name, price, fee;
    LoaiPhong (String temp){
        String a[] = temp.split("\\s+");
        this.type = a[0];
        this.name = a[1];
        this.price = a[2];
        this.fee = a[3];
    }

    public int compareTo(LoaiPhong x){
        return this.name.compareTo(x.name);
    }

    public String toString(){
        return type + " " + name + " " + price + " " + fee;
    }
}

public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in.txt"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
