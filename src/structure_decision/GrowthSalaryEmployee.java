package structure_decision;

import java.util.Locale;
import java.util.Scanner;

/**
 * Importing class Locale for use number in format USA
 * Importing class Scanner for read data user input
 */

public class GrowthSalaryEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Variables section
        float salary;

        // Read data user
        System.out.println("Input you salary: ");
        salary = sc.nextFloat();

        // Logical decision
        if (salary <= 280) {
            System.out.println("You salary actually: " + salary);
            System.out.println("You growth salary is 20%");
            System.out.println("Value of growth in: R$ " + (salary * 0.20));
            System.out.println("Salary final is: " + (salary + (salary * 0.20)));
        } else if (salary > 280 && salary <= 700) {
            System.out.println("You salary actually: " + salary);
            System.out.println("You growth salary is 15%");
            System.out.println("value of growth is: R$ " + (salary * 0.15));
            System.out.println("Salary final is: " + (salary + (salary * 0.15)));
        } else if (salary > 700 && salary <= 1500) {
            System.out.println("You salary actually: " + salary);
            System.out.println("You growth salary is 10%");
            System.out.println("Value of growth is: R$ " + (salary * 0.10));
            System.out.println("Salary final is: " + (salary + (salary * 0.10)));
        } else if (salary > 1500) {
            System.out.println("You salary actually: " + salary);
            System.out.println("You growth salary is 5%");
            System.out.println("Value of growth is: R$ " + (salary * 0.05));
            System.out.println("Salary final is: " + (salary + (salary * 0.05)));
        }

        sc.close();
    }
}
