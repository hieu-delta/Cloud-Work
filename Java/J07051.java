import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Customer implements Comparable<Customer>{
    static int stt=1;
    String name, room, day_in, day_out, id;
    int fee, stay, b[] = new int[]{0,25,34,50,80}, price, charge;

    Customer (String name, String room, String day_in, String day_out, String charge){
        this.name = modify(name);
        this.room = room;
        this.day_in = day_in;
        this.day_out = day_out;
        this.stay = calculate(day_in, day_out);
        this.price = Integer.valueOf(room.charAt(0)) - 48;
        this.charge = Integer.valueOf(charge);
        id="KH"+String.format("%02d", stt++);
        fee = b[this.price]*this.stay + this.charge;
    }

    int calculate (String in, String out){
        String temp1[] = in.split("/"), temp2[] = out.split("/");
        int day1 = Integer.valueOf(temp1[0]), month1 = Integer.valueOf(temp1[1]), day2 = Integer.valueOf(temp2[0]), month2 = Integer.valueOf(temp2[1]);
        if (month1 == month2)
            return day2 - day1 + 1;
        else{
            int months[] = new int[]{31,28,31,30,31,30,31,31,30,31,30,31}, days=months[month1] - day1;
            for (int i=month1+1; i<month2; i++)
                days += months[i];
            days+=day2;
            return days+1;
        }
    }

    public int compareTo (Customer x){
        return -Integer.compare(this.fee, x.fee);
    }

    String modify (String name){
        name = name.trim().toUpperCase();
        String temp[] = name.split("\\s+"), tmp="";
        for (String i : temp)
            tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        return tmp.trim();
    }

    public String toString() {
        return id + " " + name + " " + room + " " + stay + " " + fee;
    }
}

public class J07051 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("KHACHHANG.in.txt"));
        int n = Integer.valueOf(in.nextLine());
        Customer a[] = new Customer[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            String room = in.nextLine();
            String day_in = in.nextLine();
            String day_out = in.nextLine();
            String charge = in.nextLine();
            a[i] = new Customer(name, room, day_in, day_out, charge);
        }
        Arrays.sort(a);
        for (Customer i : a)
            System.out.println(i);
    }
}
