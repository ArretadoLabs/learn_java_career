package structure_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
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
        }


        System.out.println("Original sequence: " + Arrays.toString(numbers));
        Arrays.sort(numbers); // sorting sequence numbers
        System.out.println("Sequence sorted: " + Arrays.toString(numbers));

        sc.close();

    }
}
