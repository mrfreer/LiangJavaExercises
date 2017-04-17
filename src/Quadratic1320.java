import java.util.Scanner;

/**
 * Created by dfreer on 4/17/2017.
 */

class Complex {
    double a,b,c;
    public Complex(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] calcRoots(){
        double roots[] = new double[2];
        roots[0] = ((-b) + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
//it will take a little bit of thinking to get this working with imaginary numbers!
        roots[1] = ((-b) - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
        return  roots;
    }

}

public class Quadratic1320 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a followed by b and c:");
            Complex c = new Complex(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            double roots[] = c.calcRoots();
            if(roots[0] == roots[1])
                System.out.println("The root is " + roots[0]);
            else
                System.out.println("The roots are " + roots[0] + " and " + roots[1]);

        }
    }

}
