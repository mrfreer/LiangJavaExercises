import java.math.BigDecimal;

/**
 * Created by dfreer on 3/13/2017.
 */
public class Calc_e_1020 {
    //e = 1 + 1/1! + 1/2! + 1/3! + ...
    public Calc_e_1020(int i){
        BigDecimal bigDecimal = new BigDecimal(1);
        bigDecimal.setScale(25);
        for(int counter = 1; counter <= i; counter++){
            BigDecimal toFactorial = new BigDecimal(counter);
            BigDecimal curFactorial = factorial(toFactorial);
            BigDecimal numerator = new BigDecimal(1);
            BigDecimal doDivision = numerator.divide(curFactorial, 30, BigDecimal.ROUND_UP);
            bigDecimal = bigDecimal.add(doDivision);
        }
        System.out.println(i + " " + bigDecimal);
    }

    public static BigDecimal factorial(BigDecimal n) {
        BigDecimal factorial = BigDecimal.valueOf(1);

        for (int i = 1; i <= n.intValue(); i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i));
        }
        return factorial;
    }

    public static void main(String[] args) {
        Calc_e_1020 num1 = new Calc_e_1020(100);
        Calc_e_1020 num2 = new Calc_e_1020(200);
        Calc_e_1020 num3 = new Calc_e_1020(1000);
    }
}
