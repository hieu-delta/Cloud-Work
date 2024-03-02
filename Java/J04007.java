import java.util.Scanner;

class Employee {
    String name, gender, birth, address, taxid, date, staffid="00001";
    Employee(String name, String gender, String birth, String address, String taxid, String date) {
        this.name = name_mod(name);
        this.gender = gender;
        this.birth = birth;
        this.address = address; 
        this.taxid = taxid;
        this.date = date;
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

    void display() {
        System.out.println(staffid +" "+ name +" "+ gender +" "+ birth +" "+ address +" "+ taxid +" "+ date);
    }
}

public class J04007 {
    public static Scanner in = new Scanner(System.in);
    public static void main (String[] hihi){
        String name=in.nextLine(), gender=in.nextLine(), birth=in.nextLine(), address=in.nextLine(), taxid=in.nextLine(), date=in.nextLine();
        Employee staff = new Employee(name, gender, birth, address, taxid, date);
        staff.display();
    }
}
