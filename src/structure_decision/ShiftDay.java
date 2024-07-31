package structure_decision;

import java.util.Scanner;

/**
 * Importing class Scanner for read data user input
 */

public class ShiftDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables section
        char shiftDay;

        // Read user data
        System.out.println("Enter with letter for verify shift day: ");
        shiftDay = sc.next().charAt(0);

        // Converting letter for lower case
        shiftDay = Character.toLowerCase(shiftDay);

        // Logical decision
        if (shiftDay == 'm') {
            System.out.println("Morning");
        } else if (shiftDay == 'a') {
            System.out.println("Afternoon");
        } else if (shiftDay == 'n') {
            System.out.println("Night");
        } else {
            System.out.println("Shift invalid, try again!");
        }

        sc.close();
    }
}
