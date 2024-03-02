import java.util.Scanner;

class Teacher {
    String quota, name, role;
    long salary, base, level, support;
    Teacher (String quota, String name, long base){
        this.quota = quota.toUpperCase();
        role = this.quota.substring(0, 2);
        if (role.equals("HT"))
            support = 2000000;
        else if (role.equals("HP"))
            support = 900000;
        else if (role.equals("GV"))
            support = 500000;
        level = Long.valueOf(this.quota.substring(2, 4));
        this.name = name_mod(name);
        this.base = base;
        salary = level * base +  support;
    }

    String name_mod (String name){  
        name = name.trim().toLowerCase();
        String[] temp = name.split("\\s+");
        name="";
        for (int i=0; i<temp.length; i++){
            name += Character.toUpperCase(temp[i].charAt(0)) + temp[i].substring(1) +" ";
        }
        return name.substring(0, name.length()-1);
    }

    void display(){
        System.out.println(quota +" "+ name +" "+ level +" "+ support +" "+ salary);
    }
}

public class J04015 {
    public static Scanner in = new Scanner(System.in);
    public static void main (String[] hihi){
        String quota=in.nextLine(), name=in.nextLine();
        long base=in.nextLong();
        Teacher gv = new Teacher(quota,name,base);
        gv.display();
    }
}
