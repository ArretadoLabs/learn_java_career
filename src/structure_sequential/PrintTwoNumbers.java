package structure_sequential;

import java.util.Scanner;

public class PrintTwoNumbers {
    public static void main(String[] args) {
        // Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Section variables
        int numberOne, numberTwo, sumNumbers;

        // Read data user input
        System.out.println("number one: ");
        numberOne = sc.nextInt();

        System.out.println("number two: ");
        numberTwo = sc.nextInt();

        sumNumbers = numberOne + numberTwo;

        // Printing sum of two numbers
        System.out.println("The sum of two numbers is: " + sumNumbers);

        sc.close();
    }
}
