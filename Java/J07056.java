import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Electricity implements Comparable<Electricity>{
    static int stt=1;

    String name, id = "KH"+String.format("%02d",stt++);
    int limit, over_amount, price, over_price, amount, vat, total;

    Electricity (String name, String type, String before, String after){
        this.name = modify(name);
        if (type.equals("A"))
            limit = 100;
        else if (type.equals("B"))
            limit = 500;
        else if (type.equals("C"))  
            limit = 200;
        amount = Integer.valueOf(after.trim()) - Integer.valueOf(before.trim());
        total = calculate();
    }

    String modify (String name){
        name = name.trim().toUpperCase();
        String temp[] = name.split("\\s+"), tmp="";
        for (String i : temp)
            tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        return tmp.trim();
    }

    int calculate(){
        if (amount <= limit){
            vat = 0;
            over_price = 0;
            price = amount * 450;
            return price;
        }
        else{
            over_amount = amount - limit;
            over_price = over_amount * 1000;
            vat = over_price * 5 / 100;
            price = limit * 450;
            return price + over_price + vat;
        }
    }

    public int compareTo (Electricity x){
        return -Integer.compare(this.total, x.total);
    }
    
    public String toString() {
        return id + " " + name + " " + price + " " + over_price + " " + vat + " " + total;
    }

}

public class J07056 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("KHACHHANG.in.txt"));
        int n = Integer.valueOf(in.nextLine());
        Electricity a[] = new Electricity[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            String type = in.next();
            String before = in.next();
            String after = in.nextLine();
            a[i] = new Electricity(name, type, before, after);
        }
        Arrays.sort(a);
        for (Electricity i : a)
            System.out.println(i);
    }
}
