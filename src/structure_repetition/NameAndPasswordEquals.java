package structure_repetition;

import java.util.Scanner;

public class NameAndPasswordEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user, password;

        while (true) {
            System.out.println("Enter with your user: ");
            user = sc.next();
            System.out.println("Enter with you password: ");
            password = sc.next();

            if (user.equals(password)) {
                System.out.println("User and password is equals, try again!");
            } else {
                System.out.println("Data input valid, congrats!!");
                break;
            }
        }
        sc.close();
    }
}
