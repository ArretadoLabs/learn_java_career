package structure_repetition;

import java.util.Scanner;

public class BigFiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables section
        int number, biggerNumber = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("number: ");
            number = sc.nextInt();
            if (number > biggerNumber) {
                biggerNumber = number;
            }
        }
        System.out.printf("The bigger number is: %d ", biggerNumber);
        sc.close();
    }
}
