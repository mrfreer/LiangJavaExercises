import java.util.Scanner;

/**
 * Created by dfreer on 2/27/2017.
 */
public class Geometry45 {
    //Geometry: area of a regular polygon
    int n; //number of sides
    double area, side;
    public Geometry45(int n, double side){
        this.n = n;
        this.side = side;
    }

    public double calcArea(){
        area = (n * Math.pow(side, 2.0)) / (4 * Math.tan((Math.PI/n)));
        return area;
    }

    public static void main(String[] args) {
        int numSides;
        double side;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sides:");
        numSides = scanner.nextInt();
        System.out.println("Enter the side:");
        side = scanner.nextDouble();
        Geometry45 mathProblem = new Geometry45(numSides, side);
        System.out.println(mathProblem.calcArea());
    }

}
