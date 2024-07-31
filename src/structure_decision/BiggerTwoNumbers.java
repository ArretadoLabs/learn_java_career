package structure_decision;

import java.util.Locale;
import java.util.Scanner;

public class BiggerTwoNumbers {
    public static void main(String[] args) {
        // Import Locale for use number in format USA
        Locale.setDefault(Locale.US);

        // Import Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Variables section
        int numberOne, numberTwo;

        // Reading data user input
        System.out.println("number one: ");
        numberOne = sc.nextInt();

        System.out.println("number two: ");
        numberTwo = sc.nextInt();

        // logical decision
        if (numberOne > numberTwo) {
            System.out.printf("number one is bigger: %d ", numberOne);
        } else {
            System.out.printf("number two is bigger: %d ", numberTwo);
        }

        sc.close();
    }
}
