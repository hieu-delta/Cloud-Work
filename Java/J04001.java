import java.util.Scanner;

class Point {
    double x;
    double y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    double getX(){
        return x;
    }

    double getY(){
        return y;
    }

    double distance(Point p) {
        return Math.sqrt((this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y));
    }
 
    public String toString() {
        return (x + " " + y);
    }
}

public class J04001 {
    public static Scanner in = new Scanner(System.in);
    public static void main (String[] main){
        int t = in.nextInt();
        while(t-->0){
            double x = in.nextDouble(), y = in.nextDouble();
            Point a = new Point(x,y);
            x = in.nextDouble(); y = in.nextDouble();
            Point b = new Point(x,y);
            System.out.printf("%.4f\n", a.distance(b));
        }
    }
}