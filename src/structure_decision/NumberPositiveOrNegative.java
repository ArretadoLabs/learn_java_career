package structure_decision;

import java.util.Locale;
import java.util.Scanner;

public class NumberPositiveOrNegative {
    public static void main(String[] args) {
        // Importing class Locale for use number in format USA
        Locale.setDefault(Locale.US);

        // Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Variables section
        int number;

        // Input data
        System.out.println("number: ");
        number = sc.nextInt();

        // Logical decision
        if (number >= 0) {
            System.out.println("number is POSITIVE");
        } else {
            System.out.println("number is NEGATIVE");
        }

        sc.close();

    }
}
