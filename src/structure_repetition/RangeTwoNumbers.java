package structure_repetition;

import java.util.Scanner;

public class RangeTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberInitial, numberFinal;
        System.out.println("Number initial: ");
        numberInitial = sc.nextInt();

        System.out.println("number final: ");
        numberFinal = sc.nextInt();
        for (int i = numberInitial; i < numberFinal; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
