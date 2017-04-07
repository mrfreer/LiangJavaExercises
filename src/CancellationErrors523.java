/**
 * Created by dfreer on 4/7/2017.
 */
public class CancellationErrors523 {

    public static void main(String[] args)
    {

        double n = 1;
        double x;
        double sum = 0;
        double m = 50000;
        double y;
        double sum2 = 0;
//Wow, I never realized that there is a cancellation error with Java.
//Code taken from here: https://forums.anandtech.com/threads/java-programmers-i-need-some-homework-help.619154

        while (n <= 50000)
        {

            x = 1/n;
            sum+=x;
            n++;
        }

        while (m >= 1)
        {

            y = 1/m;
            sum2+=y;
            m--;
        }

        System.out.println("The answer for left to right is " + sum);
        System.out.println("The answer for right to left is " + sum2);
    }
}
