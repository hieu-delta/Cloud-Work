package Others;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class School implements Comparable<School>{
    String school_id, school_name;
    School (String id, String name){
        school_id = id;
        school_name = name.trim();
    }
    public int compareTo (School x){
        return this.school_name.compareTo(x.school_name);
    }
}

class SchoolTeam implements Comparable<SchoolTeam>{
    static int stt=1;
    String team_name, team_id;
    SchoolTeam (String name, String id){
        team_name = name;
        team_id = id;
    }
    public int compareTo (SchoolTeam x){
        return this.team_name.compareTo(x.team_name);
    }
    public String toString(){
        return "team" + String.format("%02d", stt++) + " " + team_name;
    }
}

public class batiap4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Input/INSTITUTION.in"));
        int n = Integer.valueOf(in.nextLine());
        School a[] = new School[n];
        for (int i=0; i<n; i++){
            String id = in.next();
            String name = in.nextLine();
            a[i] = new School(id,name);
        }
        Arrays.sort(a);

        Scanner sc = new Scanner(new File("Input/REGISTER.in"));
        n = Integer.valueOf(sc.nextLine());
        ArrayList<SchoolTeam> b = new ArrayList<>();
        for (int i=0; i<n; i++){
            String temp_id = sc.next();
            int m = Integer.valueOf(sc.nextLine().trim());
            for (int j=0; j<m; j++){
                String name = sc.nextLine();
                SchoolTeam tmp = new SchoolTeam(name,temp_id);
                b.add(tmp);
            }
        }
        Collections.sort(b);
        for (School i : a)
            for (SchoolTeam j : b)
                if (j.team_id.equals(i.school_id))
                    System.out.println(j + " " + i.school_name);
    }
}
