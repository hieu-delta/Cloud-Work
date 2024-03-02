package Others;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class MonHocPTIT {
    String subject_id, subject_name, sbject_credit;
    MonHocPTIT (String id, String name, String credit){
        subject_id = id;
        subject_name = name.trim();
        sbject_credit = credit;
    }
}

class GiangDayPTIT implements Comparable<GiangDayPTIT>{
    static int count=1;
    String group_id = "HP"+String.format("%03d",count++), teach_id, teach_day, teach_time, teach_name, teach_room;
    GiangDayPTIT (String id, String day, String time, String name, String room){
        teach_id = id;
        teach_day = day;
        teach_time = time;
        teach_name = name.trim();
        teach_room = room;
    }
    public int compareTo (GiangDayPTIT x){
        int day_compare = this.teach_day.compareTo(x.teach_day);
        if (day_compare != 0)
            return day_compare;
        else return this.teach_time.compareTo(x.teach_time);
    }
}

public class thithu3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Input/MONHOC.in"));
        int n = Integer.valueOf(in.nextLine());
        MonHocPTIT subject[] = new MonHocPTIT[n];
        for (int i=0; i<n; i++){
            String id = in.nextLine();
            String name = in.nextLine();
            String credit = in.nextLine();
            subject[i] = new MonHocPTIT(id, name, credit);
        }
        in.close();
        in = new Scanner(new File("Input/LICHGD.in"));
        n = Integer.valueOf(in.nextLine());
        GiangDayPTIT teach[] = new GiangDayPTIT[n];
        for (int i=0; i<n; i++){
            String id = in.nextLine();
            String day = in.nextLine();
            String time = in.nextLine();
            String name = in.nextLine();
            String room = in.nextLine();
            teach[i] = new GiangDayPTIT(id, day, time, name, room);
        }
        String teacher = in.nextLine();
        Arrays.sort(teach);
        System.out.println("LICH GIANG DAY GIANG VIEN " + teacher + ":");
        for (GiangDayPTIT i : teach){
            if (i.teach_name.equals(teacher)){
                System.out.print(i.group_id + " ");
                for (MonHocPTIT j : subject)
                    if (j.subject_id.equals(i.teach_id)){
                        System.out.print(j.subject_name+ " ");
                        break;
                    }
                System.out.println(i.teach_day + " " + i.teach_time + " " + i.teach_room);
            }
        }
    }
}
