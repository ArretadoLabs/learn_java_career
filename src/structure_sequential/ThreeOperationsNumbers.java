package structure_sequential;

import java.util.Locale;
import java.util.Scanner;

public class ThreeOperationsNumbers {
    public static void main(String[] args) {
        // Importing class Locale for using number in format USA
        Locale.setDefault(Locale.US);

        // Importing class Scanner for read data user input
        Scanner sc = new Scanner(System.in);

        // Variables section
        int numberOne, numberTwo, operationOne, operationTwo, operationThree;
        float numberThree;

        // Reading input data user
        System.out.println("number one: ");
        numberOne = sc.nextInt();

        System.out.println("number two: ");
        numberTwo = sc.nextInt();

        System.out.println("number three: ");
        numberThree = sc.nextFloat();

        operationOne = ((numberOne * 2) * (numberTwo / 2));
        operationTwo =  (int) ((numberOne * 3) + (numberThree));
        operationThree = (int) Math.pow(numberThree, 3);


        //Operation with three numbers
        System.out.printf("Operation one is: %d \n", operationOne);
        System.out.printf("Operation two is: %d \n", operationTwo);
        System.out.printf("Operation three is: %d ", operationThree);

        sc.close();

    }
}
