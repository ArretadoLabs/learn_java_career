package structure_arrays;

import java.util.Scanner;

/**
 * Importing class Scanner for read data user input
 */


public class PrintingFiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating array
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("input number: " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Numbers is: ");
        for (int x : numbers) {
            System.out.println(x);
        }

        sc.close();
    }
}
