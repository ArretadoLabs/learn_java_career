package structure_sequential;

import java.util.Locale;
import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        // Importing class Locale for using number format in USA
        Locale.setDefault(Locale.US);

        // Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Variables section
        float raidCircle, areaCircle;
        final float PI = 3.14F;

        // Input data user
        System.out.println("What value of size raid circle: ");
        raidCircle = sc.nextFloat();

        // Calculating area of circle
        areaCircle = PI * (float) (Math.pow(raidCircle, 2));

        // Printing value of area circle
        System.out.printf("The area of circle is: %.2f m²", areaCircle);

        sc.close();
    }
}
