package structure_sequential;

import java.util.Locale;
import java.util.Scanner;

public class SalaryBrute {
    public static void main(String[] args) {
        // Importing class Locale for use number in format USA
        Locale.setDefault(Locale.US);

        // Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Variables section
        float valueWorkHour, salaryBrute;
        int hoursWorkedInMonth;

        // Input data user
        System.out.println("How much do you make hour work: ");
        valueWorkHour = sc.nextFloat();

        System.out.println("How hours worked in month: ");
        hoursWorkedInMonth = sc.nextInt();

        // Calculating salary brute
        salaryBrute = valueWorkHour * hoursWorkedInMonth;

        // Printing you salary brute of month
        System.out.printf("You salary brute is: $ %.2f ", salaryBrute);

        sc.close();


    }
}
