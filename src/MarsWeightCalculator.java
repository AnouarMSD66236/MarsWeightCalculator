import java.text.DecimalFormat;
import java.util.Arrays;

public class MarsWeightCalculator {

    public static void main(String[] args) {

        float earthWeightmoussaid = 81;
        float marsWeightmoussaid ;
        double marsWeightDouble;
        int marsWeightInt;


        marsWeightmoussaid = (earthWeightmoussaid * 0.38F);
        System.out.println("Weigh on Mars"+" "+ marsWeightmoussaid);

        marsWeightDouble = marsWeightmoussaid;
        System.out.println("Weigh on Mars after converting to double "+marsWeightDouble);

        System.out.printf("Weigh on Mars displayed to four decimal places: %.4f %n", marsWeightDouble);

        marsWeightInt = (int)marsWeightDouble;
        System.out.println("Weigh on Mars when casted to integer " + marsWeightInt);
    }
}
