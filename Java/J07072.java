import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ChuanHoa implements Comparable<ChuanHoa>{
    String name, firstname="", lastname;
    ChuanHoa (String name){
        this.name = modify(name);
    }

    String modify(String name){
        String temp[] = name.trim().toUpperCase().split("\\s+"), tmp="";
        for (int i=0; i<temp.length; i++){
            if (i != temp.length-1)
                firstname += temp[i] + " ";
            else lastname = temp[i];
            tmp+=temp[i].charAt(0) + temp[i].substring(1).toLowerCase() + " ";
        }
        return tmp.trim();
    }

    public int compareTo (ChuanHoa x){
        int lastname_compare = this.lastname.compareTo(x.lastname);
        if (lastname_compare != 0)
            return lastname_compare;
        else return this.firstname.compareTo(x.firstname);
    }
}

public class J07072 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("C:\\Users\\nguye\\Downloads\\PTIT\\Code\\Java\\Input\\DANHSACH.in.txt"));
        ArrayList<ChuanHoa> s = new ArrayList<>();
        while(in.hasNextLine()){
            String temp = in.nextLine();
            ChuanHoa tmp = new ChuanHoa(temp);
            s.add(tmp);
        }
        Collections.sort(s);
        for (ChuanHoa i : s)
            System.out.println(i.name);
    }
}
