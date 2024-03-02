import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Name_Search implements Comparable<Name_Search>{
    String fullname, shortname, firstname="", lastname;
    Name_Search (String name){
        fullname = name;
        shortname = modify(name);
    }

    String modify(String name){
        String temp[] = name.split("\\s+"), tmp="";
        for (int i=0; i<temp.length; i++){
            if (i != temp.length-1)
                firstname += temp[i] + " ";
            else lastname = temp[i];
            tmp+=temp[i].charAt(0)+".";
        }
        return tmp.substring(0, tmp.length()-1);
    }

    public int compareTo (Name_Search x){
        int lastname_compare = this.lastname.compareTo(x.lastname);
        if (lastname_compare != 0)
            return lastname_compare;
        else return this.firstname.compareTo(x.firstname);
    }
}

public class J07071 {
    static int check (String s1, String s2){
        if (s1.length() != s2.length())
            return 0;
        for (int i=0; i<s1.length(); i++){
            if (s1.charAt(i) != '*')
                if (s1.charAt(i) != s2.charAt(i))
                    return 0;
        }
        return 1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("C:\\Users\\nguye\\Downloads\\PTIT\\Code\\Java\\Input\\DANHSACH.in.txt"));
        int n = Integer.valueOf(in.nextLine());
        Name_Search a[] = new Name_Search[n];
        for (int i=0; i<n; i++){
            String name = in.nextLine();
            a[i] = new Name_Search(name);
        }
        Arrays.sort(a);
        int m = Integer.valueOf(in.nextLine());
        ArrayList<Name_Search> s = new ArrayList<>();
        for (int i=0; i<m; i++){
            String temp = in.nextLine();
            //System.out.println(temp);
            for (int j=0; j<n; j++)
                if (check(temp, a[j].shortname)==1)
                    s.add(a[j]);
            for (Name_Search j : s)
                System.out.println(j.fullname);
            s.clear();
        }
    }
}
