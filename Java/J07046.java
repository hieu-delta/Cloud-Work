import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Guest implements Comparable<Guest>{
    String name, room, in, out, id;
    static int stt=1;
    int stay;
    Guest (String name, String room, String in, String out){
        this.name = standardize(name);
        this.room = room;
        this.in = modify(in);
        this.out = modify(out);
        stay = calculate(in, out);
        id = "KH" + String.format("%02d",stt++);
    }

    String standardize (String s){
        s = s.trim().toUpperCase();
        String temp[] = s.split("\\s+"), tmp="";
        for (String i : temp)
            tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        return tmp.trim();
    }

    String modify (String s){
        String temp[] = s.split("/");
        return String.format("%02d", Integer.valueOf(temp[0])) + String.format("%02d", Integer.valueOf(temp[1])) + temp[2];
    }

    int calculate (String in, String out){
        String temp1[] = in.split("/"), temp2[] = out.split("/");
        int day1 = Integer.valueOf(temp1[0]), month1 = Integer.valueOf(temp1[1]), day2 = Integer.valueOf(temp2[0]), month2 = Integer.valueOf(temp2[1]);
        if (month1 == month2)
            return day2 - day1;
        else{
            if (month1 == 1 || month1 == 3 || month1 == 5 || month1 == 7 || month1 == 8 || month1 == 10 || month1 == 12)
                return (31 - day1) + (day2);
            else if (month1 == 2){
                    if (Integer.valueOf(temp1[2])%4==0)
                        return (29 - day1) + (day2);
                    else return (28 - day1) + (day2);
                }
            else return (30 - day1) + (day2);
        }
    }

    public int compareTo (Guest x){
        return Integer.compare(this.stay, x.stay);
    }

    public String toString(){
        return id + " " + name + " " + room + " " + stay;
    }
}

public class J07046 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("KHACH.in.txt"));
        int n = Integer.valueOf(in.nextLine());
        Guest a[] = new Guest[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            String room = in.nextLine();
            String day_in = in.nextLine();
            String day_out = in.nextLine();
            a[i] = new Guest(name, room, day_in, day_out);
        }
        Arrays.sort(a);
        for (int i=n-1; i>=0; i--)
            System.out.println(a[i]);
    }
}
