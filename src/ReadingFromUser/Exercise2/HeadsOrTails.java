package ReadingFromUser.Exercise2;

import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(2);
        Scanner sc = new Scanner(System.in);

        System.out.println("Heads or tails? (0 - heads, 1 - tails)");
        int userChoice = sc.nextInt();

        if (userChoice == randomNumber) {
            System.out.println("You won! It is a " + (randomNumber == 0 ? "heads" : "tails") + "!");
        } else {
            System.out.println("You lost!");
        }
        sc.close();
    }
}
