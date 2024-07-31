package structure_sequential;

import java.util.Locale;
import java.util.Scanner;

public class WeightManWomen {
    public static void main(String[] args) {
        // Importing class Locale for using number in format USA
        Locale.setDefault(Locale.US);

        // Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Variables section
        float heightPeople, weightMan, weightWomen;

        // Read data user
        System.out.println("What you height: ");
        heightPeople = sc.nextFloat();

        weightMan = (float) ((72.7 * heightPeople) - 58);
        weightWomen = (float) ((62.1 * heightPeople) - 44.7);

        System.out.printf("The weight ideal for man is: %.2f kg\n", weightMan);
        System.out.printf("The weight ideal for women is: %.2f kg", weightWomen);

        sc.close();
    }
}
