package Conditions;

import java.util.Random;

public class IfTest {
    public static void main(String[] args) {
        Random random = new Random();

        User user = new User("John", "Doe");
        System.out.println(user);

        System.out.println("Choose option:");
        System.out.println("0 - exit");
        System.out.println("1 - show user info");
        System.out.println("2 - modify user info");

        int option = random.nextInt(4);
        System.out.println("Your option is: " + option);

        if (option == 0) {
            System.out.println("Bye, bye");
        } else if (option == 1) {
            System.out.println(user);
        } else if (option == 2) {
            user.setFirstName("Jane");
            user.setLastName("Doe");
            System.out.println(user);
        } else {
            System.out.println("Unknown option");
        }


    }
}
