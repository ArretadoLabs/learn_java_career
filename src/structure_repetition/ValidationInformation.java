package structure_repetition;

import java.util.Scanner;

public class ValidationInformation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //---------------------- Variables ------------------------
        String name;
        int age;
        float salary;
        char gender;
        char stateCivil;
        //---------------------------------------------------------

        while (true) {
            System.out.println("Input your name: ");
            name = sc.next();
            if (name.length() < 3) {
                System.out.println("Name need most 3 characters");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Enter with you age: ");
            age = sc.nextInt();
            if (age >= 0 && age <= 150) {
                break;
            } else {
                System.out.println("Age invalid, try again!");
            }
        }

        while (true) {
            System.out.println("Enter with your salary: ");
            salary = sc.nextFloat();
            if (salary > 0) {
                System.out.println("salary is valid " + salary);
                break;
            } else {
                System.out.println("Salary is invalid, try again!");
            }
        }

        while (true) {
            System.out.println("Enter with you gender: ");
            gender = sc.next().charAt(0);
            gender = Character.toLowerCase(gender);
            if (gender == 'f' || gender == 'm') {
                System.out.println("Gender is valid!");
                break;
            } else {
                System.out.println("Gender is invalid, try again!");
            }
        }

        while (true) {
            System.out.println("Enter with you state civil: ");
            stateCivil = sc.next().charAt(0);
            stateCivil = Character.toLowerCase(stateCivil);

            if (stateCivil == 's' || stateCivil == 'c' || stateCivil == 'v' || stateCivil == 'd') {
                System.out.println("State civil is valid!");
                break;
            } else {
                System.out.println("State civil is invalid, try again!");
            }
        }
    }
}
