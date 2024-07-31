package structure_sequential;

import java.util.Locale;
import java.util.Scanner;

public class ConverterTemperature {
    public static void main(String[] args) {
        // Importing class Locale for use number in format USA
        Locale.setDefault(Locale.US);

        // Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Variables section
        float fahrenheit, converterTemperature;

        // Input data user
        System.out.println("Enter with temperature in Fº: ");
        fahrenheit = sc.nextFloat();

        // Converting temperature
        converterTemperature = 5 * ((fahrenheit - 32) / 9);

        // Printing temperature converted for Celsius
        System.out.printf("Temperature in %.2f Fº converted for %.2f Cº ", fahrenheit, converterTemperature);

        sc.close();
    }
}
