package structure_sequential;

import java.util.Locale;
import java.util.Scanner;

public class BiggerNumbers {
    public static void main(String[] args) {
        // Importing class Locale for use number in format USA
        Locale.setDefault(Locale.US);

        // Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Variables section
        int numberOne, numberTwo, numberThree;

        // Read data user input
        System.out.println("number one: ");
        numberOne = sc.nextInt();

        System.out.println("number two: ");
        numberTwo = sc.nextInt();

        System.out.println("number three: ");
        numberThree = sc.nextInt();

        if (numberOne + numberTwo == numberThree) {
            System.out.println("This is result is: " + true);
        } else {
            System.out.println("This is result is: " + false);
        }

        sc.close();
    }
}
