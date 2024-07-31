package structure_sequential;

import java.util.Scanner;

public class InputNumber {
    public static void main(String[] args) {
        // Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Section variables
        int number;

        // Input data user
        System.out.println("Number: ");
        number = sc.nextInt();

        // Printing number input user
        System.out.println("You number is: " + number);

        sc.close();
    }
}

