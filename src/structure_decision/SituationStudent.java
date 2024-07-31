package structure_decision;

import java.util.Locale;
import java.util.Scanner;

/**
 * Importing class Locale for use number in format USA
 * Importing class Scanner for read data user input
 */

public class SituationStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Variables section
        float noteOne, noteTwo, averageNotes;

        // Read data user input
        System.out.println("Note one: ");
        noteOne = sc.nextFloat();

        System.out.println("Note two: ");
        noteTwo = sc.nextFloat();

        // Calculating average of notes
        averageNotes = (noteOne + noteTwo) / 2.0F;

        // Logical decision
        if (averageNotes == 10.0) {
            System.out.println("Approved with distinction");
        } else if (averageNotes >= 7.0 && averageNotes <= 9.9) {
            System.out.println("Approved");
        } else if (averageNotes < 7.0 && averageNotes > 0.0) {
            System.out.println("Reproved");
        }

        sc.close();
    }
}
