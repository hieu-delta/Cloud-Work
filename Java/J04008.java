// import java.util.Scanner;

// class Point {
//     double x;
//     double y;

//     Point() {
//         x = 0;
//         y = 0;
//     }

//     Point(double x, double y){
//         this.x = x;
//         this.y = y;
//     }

//     Point(Point p) {
//         this.x = p.x;
//         this.y = p.y;
//     }

//     double getX(){
//         return x;
//     }

//     double getY(){
//         return y;
//     }

//     double distance(Point p) {
//         return Math.sqrt((this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y));
//     }

//     double distance(Point p1, Point p2){
//         return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p2.y - p1.y)*(p2.y - p1.y));
//     }
//     public String toString() {
//         return (x + " " +y);
//     }
    
// }

// class Triangle {
//     Point p1;
//     Point p2;
//     Point p3;
//     double d1,d2,d3;

//     Triangle (Point p1, Point p2, Point p3){
//         this.p1 = p1;
//         this.p2 = p2;
//         this.p3 = p3;
//         d1 = p1.distance(p2);
//         d2 = p2.distance(p3);
//         d3 = p3.distance(p1);
//     }

//     double p_check(){
//         if (d1+d2>d3 && d2+d3>d1 && d1+d3>d2)
//             return d1+d2+d3;
//         else return 0;
//     }

//     void display() {
//         if (p_check()==0)
//             System.out.println("INVALID");
//         else System.out.printf("%.3f\n",p_check());
//     }
// }

// public class J04008 {
//     public static Scanner in = new Scanner(System.in);
//     public static void main (String[] hihi){
//         int t=in.nextInt();
//         while(t-->0){
//             double x=in.nextDouble(), y=in.nextDouble();
//             Point p1 = new Point(x,y);
//             x=in.nextDouble(); y=in.nextDouble();
//             Point p2 = new Point(x,y);
//             x=in.nextDouble(); y=in.nextDouble();
//             Point p3 = new Point(x,y);
//             Triangle p = new Triangle(p1, p2, p3);
//             p.display();
//         }
//     }
// }