package structure_sequential;

import java.util.Locale;
import java.util.Scanner;

public class WeightIdealPeople {
    public static void main(String[] args) {
        // Importing Locale for use number in format USA
        Locale.setDefault(Locale.US);

        // Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Variables section
        float heightPeople, weightIdeal;

        // Read data user input
        System.out.println("Enter with your height: ");
        heightPeople = sc.nextFloat();

        // Calculating weight ideal for people
        weightIdeal = (float) (72.7 * heightPeople) - 58;

        // Printing weight ideal
        System.out.printf("The weight ideal is: %.2f kg", weightIdeal);

        sc.close();

    }
}
