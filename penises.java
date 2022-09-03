import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class penises {

    private static final DecimalFormat df = new DecimalFormat("0.00");000000000000000000000000000000000000000000000000

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float i;
        float summ = 0;
        float numero = 0.0f;
        for (i = 1; i <= 10; i++){
            numero = 1.0f / i;
            System.out.println(df.format(1.0f / i));
            summ = summ + numero;
        }
        System.out.println("");
        System.out.println(summ);
    }
}
