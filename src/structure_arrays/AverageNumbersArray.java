package structure_arrays;

import java.util.Scanner;

public class AverageNumbersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating variables and array
        int[] numbers = new int[5];
        int sumNumbers = 0, averageNumbers;

        // loop iteration for inserting numbers in array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number: " + i);
            numbers[i] = sc.nextInt();
            sumNumbers += numbers[i];
        }

        // Calculating average of numbers
        averageNumbers = sumNumbers / numbers.length;

        // Printing final value of average numbers
        System.out.println("The average numbers: " + averageNumbers);

        sc.close();
    }
}
