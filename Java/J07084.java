// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Arrays;
// import java.util.Scanner;

// class Online_time implements Comparable<Online_time>{
//     String name, time1, time2, date1, date2;
//     long time;
//     Online_time (String name, String date1, String date2, String time1, String time2){
//         this.name = modify(name);
//         this.date1 = date1;
//         this.date2 = date2;
//         this.time1 = time1; 
//         this.time2 = time2;
//         calculate();
//     }

//     String modify (String name){
//         name = name.trim().toUpperCase();
//         String temp[] = name.split("\\s+"), tmp="";
//         for (String i : temp)
//             tmp += i.charAt(0) + i.substring(1).toLowerCase() + " ";
//         return tmp.trim();
//     }

//     void calculate(){
//         int day1, day2, hour1, minute1, hour2, minute2, second1, second2;
//         long t1, t2;
//         day1 = Integer.valueOf(date1.split("/")[0]);
//         day2 = Integer.valueOf(date2.split("/")[0]);
//         hour1 = Integer.valueOf(time1.split(":")[0]);
//         minute1 = Integer.valueOf(time1.split(":")[1]);
//         second1 = Integer.valueOf(time1.split(":")[2]);
//         hour2 = Integer.valueOf(time2.split(":")[0]);
//         minute2 = Integer.valueOf(time2.split(":")[1]);
//         second2 = Integer.valueOf(time2.split(":")[2]);
//         t1 = (hour1*60 + minute1)*60 + second1;
//         t2 = ((day2-day1)*24*60 + hour2*60 + minute2)*60 + second2;
//         time = (t2 -t1)/60;
//     }

//     public int compareTo (Online_time x){
//         if (Long.compare(this.time, x.time) != 0)
//             return -Long.compare(this.time, x.time);
//         else return this.name.compareTo(x.name);
//     }

//     public String toString(){
//         return name + " " + time;
//     }

// }

// public class J07084 {
//     public static void main(String[] args) throws FileNotFoundException {
//         Scanner in = new Scanner(new File("Input/ONLINE.in"));
//         int n = Integer.valueOf(in.nextLine());
//         Online_time a[] = new Online_time[n];
//         for (int i=0; i<n; i++){
//             String name = in.nextLine();
//             String date1 = in.next();
//             String time1 = in.nextLine().trim();
//             String date2 = in.next();
//             String time2 = in.nextLine().trim();
//             a[i] = new Online_time(name, date1, date2, time1, time2);
//         }
//         Arrays.sort(a);
//         for (Online_time i : a)
//             System.out.println(i);
//     }
// }
