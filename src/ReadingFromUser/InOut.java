package ReadingFromUser;

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert your name: ");
        String firstName = sc.nextLine();
        System.out.println("Insert your surname: ");
        String lastName = sc.nextLine();
        System.out.println("Insert your age: ");
        int age = sc.nextInt();

        System.out.println("Your name is " + firstName + " " + lastName + " and you are " + age + " years old.");

        System.out.println("Insert your age: ");
        int age2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Insert your name: ");
        String firstName2 = sc.nextLine();
        System.out.println("Insert your surname: ");
        String lastName2 = sc.nextLine();

        System.out.println("Your name is " + firstName2 + " " + lastName2 + " and you are " + age2 + " years old.");
    }
}
