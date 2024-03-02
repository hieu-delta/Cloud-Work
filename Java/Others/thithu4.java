package Others;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class GiangVienPTIT {
    String teacher_id, teacher_name;
    Float teach_hour=0f;
    GiangVienPTIT (String id, String name){
        teacher_id = id;
        teacher_name = name.trim();
    }
    public String toString(){
        return teacher_name + " " + String.format("%.2f",teach_hour);
    }
}

public class thithu4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner (new File("Input/GIANGVIEN.in"));
        int n = Integer.valueOf(in.nextLine());
        GiangVienPTIT a[] = new GiangVienPTIT[n];
        for (int i=0; i<n; i++){
            String id = in.next();
            String name = in.nextLine();
            a[i] = new GiangVienPTIT(id, name);
        }
        in.close();
        in = new Scanner(new File("Input/GIOCHUAN.in"));
        n = Integer.valueOf(in.nextLine());
        for (int i=0; i<n; i++){
            String temp = in.nextLine();
            String tmp[] = temp.split("\\s+");
            for (GiangVienPTIT j : a){
                if (tmp[0].equals(j.teacher_id)==true){
                    j.teach_hour += Float.valueOf(tmp[2]);
                    break;
                }
            }
        }
        for (GiangVienPTIT i : a)
            System.out.println(i);
    }
}
