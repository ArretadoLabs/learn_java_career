package structure_decision;

import java.util.Locale;
import java.util.Scanner;

public class LetterVogalOrConsonant {
    public static void main(String[] args) {
        // Importing class Locale for user number format in USA
        Locale.setDefault(Locale.US);

        // Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Variables section
        char letter;

        //letter = Character.toLowerCase(letter);

        // read data user input
        System.out.println("Enter with a letter: ");
        letter = sc.next().charAt(0);

        // Verify value of letter
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("Your letter is vogal");
        } else if (Character.isLetter(letter)) {
            System.out.println(letter + "is consonant");
        } else {
            System.out.println("Input invalid, try again!");
        }

    }
}
