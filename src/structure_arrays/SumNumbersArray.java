package structure_arrays;

import java.util.Scanner;

public class SumNumbersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays section
        int[] numbers = new int[5];
        int sumNumbers = 0;

        // loop iteration
        for (int i = 0; i < 5; i++) {
            System.out.println("number in index: " + i);
            numbers[i] = sc.nextInt();
            sumNumbers += numbers[i];
        }

        System.out.println("The sum of numbers is: " + sumNumbers);

        sc.close();
    }
}
