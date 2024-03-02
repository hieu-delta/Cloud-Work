import java.util.Scanner;

class Rectange {
    double width, height;
    String color;

    Rectange() {
        width = 1;
        height = 1;
    }

    Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getHeiht() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    double findArea() {
        double s;
        s = height*width;
        return s;
    }

    double findPerimeter() {
        double p;
        p = (height + width)*2;
        return p;
    }
}

public class J04002 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] hcn){
        double dai=in.nextDouble(), rong=in.nextDouble();
        String mau=in.nextLine();
        if (dai > 0 && rong > 0){
            mau = mau.toUpperCase();
            mau = mau.charAt(1) + mau.substring(2).toLowerCase();
            Rectange x = new Rectange(dai, rong, mau);
            System.out.println((int) x.findPerimeter() + " " +(int) x.findArea() + " " +  x.getColor());
        }
        else System.out.println("INVALID");
    }
}
