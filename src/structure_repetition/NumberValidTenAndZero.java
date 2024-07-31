package structure_repetition;

import java.util.Scanner;

/**
 * Importing class Scanner for read data user input
 */

public class NumberValidTenAndZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        // Structure received value "true" for force enter in structure validation number
        while (true) {
            System.out.println("Enter with number: ");
            number = sc.nextInt();

            if (number >= 0 && number <= 10) {
                System.out.println("number is valid, congrats! " + number);
                break;
            } else {
                System.out.println("number is invalid, try again!!");
            }
        }
        sc.close();
    }
}
