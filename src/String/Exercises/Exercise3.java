package String.Exercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        if (Character.isUpperCase(text.charAt(0))) System.out.println(text.toUpperCase());
        else if (Character.isLowerCase(text.charAt(0))) System.out.println(text.toLowerCase());
        else System.out.println(text);

        scanner.close();
    }
}
