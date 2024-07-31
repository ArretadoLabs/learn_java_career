package structure_sequential;

import java.util.Locale;
import java.util.Scanner;

public class ConverterSize {
    public static void main(String[] args) {
        // Importing class Locale for using value in format USA
        Locale.setDefault(Locale.US);

        // Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Variables section
        float sizeMeters, converterSize;

        // Input data user
        System.out.println("What size in meters: ");
        sizeMeters = sc.nextFloat();

        converterSize = sizeMeters * 100;

        // Printing value final is converted meters for centimeters
        System.out.printf("The final value meters for centimeters is: %.2f cm's ", converterSize);

        sc.close();

    }
}
