package structure_decision;

import java.util.Locale;
import java.util.Scanner;

public class GenderIndentify {
    public static void main(String[] args) {
        // Importing class Locale for use number in format USA
        Locale.setDefault(Locale.US);

        // Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Variables section
        String letterGender;

        // Read data user input
        System.out.println("Input you letter of gender: ");
        letterGender = sc.next();

        if (letterGender.equals("f") || letterGender.equals("F")) {
            System.out.println("Your gender is: Female");
        } else if (letterGender.equals("m") || letterGender.equals("M")) {
            System.out.println("Your gender is: Male");
        } else {
            System.out.println("Gender invalid");
        }

        sc.close();
    }
}
