import java.util.Scanner;

class Student {
    String name, date;
    float sub1, sub2, sub3, sum;

    String modify (String name){
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
        return temp;
    }

    Student (String name,String date, float sub1, float sub2, float sub3){
        this.name = modify(name);
        this.date = date;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    float overall (){
        return sub1 + sub2 + sub3;
    }
}

public class J04005 {
    public static Scanner in = new Scanner(System.in);
    public static void main (String[] mama){
        String name = in.nextLine();
        String date = in.nextLine();
        float sub1 = in.nextFloat(), sub2 = in.nextFloat(), sub3 = in.nextFloat();
        Student svien = new Student(name,date,sub1,sub2,sub3); 
        System.out.print(svien.name +svien.date +" ");
        System.out.printf("%.1f\n",svien.overall());
    }
}
