import java.util.Scanner;

/**
 * Created by dfreer on 2/27/2017.
 */

class Point{
    double lat, longitude;
    Point(double lat, double longitude){
        this.lat = lat;
        this.longitude = longitude;
    }
}
public class Geography42 {
    public static final double RADIUS = 6371.01;

    public static double calcDistanceSphere(Point a, Point b){
        double d;
        d = RADIUS * Math.acos(
                    (Math.sin(Math.toRadians(a.lat)) *
                    Math.sin(Math.toRadians(b.lat)) +
                    Math.cos(Math.toRadians(a.lat)) *
                    Math.cos(Math.toRadians(b.lat)) *
                    Math.cos(Math.toRadians(a.longitude) -
                            Math.toRadians(b.longitude))));
        return d;
    }

    public static void main(String[] args) {
        double lat1, lat2, long1, long2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees:");
        lat1 = scanner.nextDouble();
        long1 = scanner.nextDouble();
        System.out.println("Enter point 2 (latitude and longitude) in degrees:");
        lat2 = scanner.nextDouble();
        long2 = scanner.nextDouble();
        System.out.println("The distance between the two points is " +
                calcDistanceSphere(new Point(lat1, long1), new Point(lat2, long2))
                + " km");
    }

}
