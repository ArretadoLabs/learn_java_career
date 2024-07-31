package structure_sequential;

import java.util.Locale;
import java.util.Scanner;

public class AreaSquare {
    public static void main(String[] args) {
        // Importing class Locale for use number decimal in format USA
        Locale.setDefault(Locale.US);

        // Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Variables section
        float sideSquare, areaSquare;

        // Input data user
        System.out.println("What value of side square: ");
        sideSquare = sc.nextFloat();

        // Calculating area of Square
        areaSquare = sideSquare * sideSquare;

        // Printing value final of Square
        System.out.printf("The area of square is: %.2f m² \n", areaSquare);
        System.out.printf("The value double of area square is: %.2f m² ", areaSquare * 2);

        sc.close();
    }
}
