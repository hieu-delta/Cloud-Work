import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Participants {
    static int stt=1;
    String name, date, age, id="PH"+String.format("%02d",stt++), grade;
    float mark1, mark2, extra, avg;
    Participants (String name, String date, String mark1, String mark2){
        this.name = modify(name);
        this.date = format(date);
        this.mark1 = Float.valueOf(mark1);
        this.mark2 = Float.valueOf(mark2);
        if (this.mark1 >= 8 && this.mark2 >= 2)
            extra = 1;
        else if (this.mark1 >= 7.5 && this.mark2 >= 7.5)
            extra = 0.5f;
        avg = (this.mark1 + this.mark2) / 2 + extra;
        if (avg < 10)
            avg = Math.round(avg);
        else avg = 10;
        if (avg < 5)
            grade = "Truot";
        else if (5 <= avg && avg < 7)
            grade = "Trung binh";
        else if (7 <= avg && avg < 8)
            grade = "Kha";
        else if (8 <= avg && avg < 9)
            grade = "Gioi";
        else grade = "Xuat sac";
    }

    String modify (String name){
        name = name.trim().toUpperCase();
        String temp[] = name.split("\\s+"), tmp="";
        for (String i : temp)
            tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
        return tmp.trim();
    }

    String format (String date) {
        String temp[] = date.split("/");
        if (temp[0].length()==1)
            temp[0] = "0" + temp[0];
        if (temp[1].length()==1)
            temp[1] ="0" + temp[1];
        age = Integer.toString(2021 - Integer.valueOf(temp[2]));
        return temp[0] + "/" + temp[1] + "/" +temp[2];
    }

    public String toString() {
        return id + " " + name + " " + age + " " + (int) avg + " " + grade;
    }

}

public class J07053 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("XETTUYEN.in.txt"));
        int n = Integer.valueOf(in.nextLine());
        Participants a[] = new Participants[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            String date = in.nextLine();
            String mark1 = in.nextLine();
            String mark2 = in.nextLine();
            a[i] = new Participants(name, date, mark1, mark2);
        }

        for (Participants i : a)
            System.out.println(i);
    }
}
