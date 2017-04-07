/**
 * Created by dfreer on 4/7/2017.
 */
public class Computee526 {

    public static double calcE(int val){
        double e = 1;
        for(int i = 1; i <= val; i++){
            double curNum = 1, curDen = i;
            int counter = i-1;
            while(counter > 0){
                curDen *= counter;
                counter--;
            }
//            System.out.println(curDen);
            e += (curNum / curDen);

        }
        return e;
    }

    public static void main(String[] args) {
        for(int i = 10000; i < 100000; i+= 10000)
            System.out.println(calcE(i));
    }
}
