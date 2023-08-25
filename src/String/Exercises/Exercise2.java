package String.Exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press key to roll dice.");
        scanner.nextLine();
        System.out.println(Dice.roll());
    }
}
