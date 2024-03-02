import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Contest_Schedule implements Comparable<Contest_Schedule>{
    static int stt=1;
    String id = "C" + String.format("%03d", stt++), class_id, date, time;
    int day, month, year, hour, minute;

    Contest_Schedule (String date, String time, String class_id){
        this.class_id = class_id;
        this.date = date;
        this.time = time;
        date_format(date);
        time_format(time);
    }

    void date_format (String date){
        String temp[] = date.split("/");
        day = Integer.valueOf(temp[0]);
        month = Integer.valueOf(temp[1]);
        year = Integer.valueOf(temp[2]);
    }

    void time_format (String time){
        String temp[] = time.split(":");
        hour = Integer.valueOf(temp[0]);
        minute = Integer.valueOf(temp[1]);
    }

    public int compareTo (Contest_Schedule x){
        int day_compare = Integer.compare(this.day, x.day);
        int month_compare = Integer.compare(this.month, x.month);
        int year_compare = Integer.compare(this.year, x.year);
        int hour_compare = Integer.compare(this.hour, x.hour);
        int minute_compare = Integer.compare(this.minute, x.minute);
        int id_compare = this.id.compareTo(x.id);
        if (year_compare != 0)
            return year_compare;
        else if (month_compare != 0)
            return month_compare;
        else if (day_compare != 0)
            return day_compare;
        else if (hour_compare != 0)
            return hour_compare;
        else if (minute_compare != 0)
            return minute_compare;
        else return id_compare;
    }

    public String toString(){
        return id + " " + date + " " + time + " " + class_id; 
    }
}

public class J07059 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("C:\\Users\\nguye\\Downloads\\PTIT\\Code\\Java\\Input\\CATHI.in"));
        int n = Integer.valueOf(in.nextLine());
        Contest_Schedule a[] = new Contest_Schedule[n];
        for (int i=0; i<n; i++){
            String date = in.nextLine();
            String time = in.nextLine();
            String class_id = in.nextLine();
            a[i] = new Contest_Schedule(date, time, class_id);
        }
        Arrays.sort(a);
        for (Contest_Schedule i : a)
            System.out.println(i);
    }
}
