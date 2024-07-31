package structure_sequential;

import java.util.Locale;
import java.util.Scanner;

public class WeightFishTax {
    public static void main(String[] args) {
        // Importing class Locale for use number in format USA
        Locale.setDefault(Locale.US);

        // Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Variables section
        float taxFish, weightFish;

        //Input data user
        System.out.println("What weight fish: ");
        weightFish = sc.nextFloat();

        if (weightFish > 50) {
            taxFish = (weightFish - 50) * 4;
            System.out.printf("Price tax of excess weight fish is: $%.2f ", taxFish);
        }

        sc.close();
    }
}
