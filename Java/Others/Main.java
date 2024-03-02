package Others;
import java.util.Scanner;

class Fraction {
    long numerator, denominator ;
    // public Fraction(){
    //     this.denominator = 1;
    //     this.numerator = 1;
    // }
    public Fraction(long numerator, long denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }

    public Fraction simplified(){
        long GCD = gcd(this.numerator, this.denominator);
        //tra ve phan so toi gian
        Fraction fe = new Fraction(this.numerator/GCD, this.denominator/GCD);
        //toi gian phan so goc
        this.denominator = this.denominator / GCD;
        this.numerator = this.numerator / GCD;
        return fe;
    }
    
    public void plus(Fraction B){
        long lcm = this.denominator * B.denominator / gcd(this.denominator, B.denominator);
        //cong
        Fraction fr = new Fraction(this.numerator * lcm/(this.denominator) + B.numerator * lcm/(B.denominator), lcm);
        fr = fr.simplified();
        System.out.println(fr.numerator+"/"+fr.denominator);
    }

    // public String toString(){
    //     if(denominator == 1){
    //         return numerator + "";
    //     }
    //     return numerator + "/" + denominator;
    // }
}

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Fraction A = new Fraction(input.nextLong(), input.nextLong());
        Fraction B = new Fraction(input.nextLong(), input.nextLong());
        A.plus(B);
        input.close();
    }
    
}