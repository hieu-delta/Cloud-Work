import java.util.Scanner;

class Ptiter {
    String name, date, id="B20DCCN001", classid;
    float gpa;
    // Ptiter (){
    //     name = null;
    //     date = null;
    //     id = "B20DCCN001";
    //     gpa = 0;
    // }

    String name_mod (String name){
        String temp="";
        name.toLowerCase();
        name = " " + name + " ";
        for (int i=0; i<name.length(); i++){
            if (name.charAt(i)!=' ' && name.charAt(i-1)==' '){
                int j =i+1;
                char c = name.charAt(i);
                temp+=Character.toUpperCase(c);
                while(name.charAt(j)!=' '){
                    temp+=name.charAt(j);
                    j++;
                }
                temp+=" ";
                i=j;
            }
        }
        temp = temp.substring(0, temp.length()-1);
        return temp;
    }

    String date_mod (String date){
        String[] temp = date.split("/");
        if (temp[0].length()==1)
            temp[0]="0"+temp[0];
        if (temp[1].length()==1)
            temp[1]="0"+temp[1];
        if (temp[2].length()<4)
            for (int i=1; i<=(4-temp[2].length()); i++)
                temp[2]="0"+temp[2];
        return (temp[0]+"/"+temp[1]+"/"+temp[2]);
    }

    Ptiter (String name, String date, String classid, float gpa){
        this.name = name_mod(name);
        this.date = date_mod(date);
        this.classid = classid.toUpperCase();
        this.gpa = gpa;
    }

    void display(){
        System.out.print(id +" "+ name +" "+ classid +" "+ date + " ");
        System.out.printf("%.2f\n",gpa);
    }
}

public class J04006 {
    public static Scanner in = new Scanner(System.in);
    public static void main (String[] hihi){
        String name=in.nextLine(), classid=in.nextLine(), date=in.nextLine();
        float gpa=in.nextFloat();
        Ptiter student = new Ptiter(name, date, classid, gpa);
        student.display();
    }
}
