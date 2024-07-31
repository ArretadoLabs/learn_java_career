package structure_repetition;

import java.util.Scanner;

public class SumAndAverageNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, sumNumbers = 0, averageNumbers;

        for (int i = 0; i < 5; i++) {
            System.out.println("number: " + i);
            number = sc.nextInt();
            sumNumbers += number;
        }

        // Calculating average of numbers
        averageNumbers = sumNumbers / 5;

        // Printing average and sum of numbers
        System.out.printf("Sum of numbers is: %d \n", sumNumbers);
        System.out.printf("Average of sum numbers is: %d ", averageNumbers);

        sc.close();
    }
}
