package structure_arrays;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays section
        int[] numbers = new int[5];
        String[] letters = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("number: " + i);
            numbers[i] = sc.nextInt();

            System.out.println("String: " + i);
            letters[i] = sc.next();
        }

        System.out.println("numbers inserted is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("index: " + i + ": " + numbers[i]);
            System.out.println("index: " + i + ": " + letters[i]);
        }
        sc.close();

    }
}
