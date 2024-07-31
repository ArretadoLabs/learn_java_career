package structure_sequential;

import java.util.Locale;
import java.util.Scanner;

public class FourNotesAverage {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        //Variables section
        float noteOne, noteTwo, noteThree, noteFour, averageNotes;

        // Iteration data user input
        System.out.println("note one: ");
        noteOne = sc.nextFloat();

        System.out.println("note two: ");
        noteTwo = sc.nextFloat();

        System.out.println("note three: ");
        noteThree = sc.nextFloat();

        System.out.println("note four: ");
        noteFour = sc.nextFloat();

        // Calculating average of fourth notes
        averageNotes = (noteOne + noteTwo + noteThree + noteFour) / 4.0f;

        // Printing value final average using "printf" for formatting decimal data
        System.out.printf("The average final notes is: %.2f ", averageNotes);

        sc.close();
    }
}
