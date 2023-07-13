package ReadingFromUser;

import java.util.Locale;
import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Insert first number: ");
        var firstNumber = sc.nextDouble();
        System.out.println("Insert second number: ");
        var secondNumber = sc.nextDouble();

        sc.close();
        System.out.println("Sum: " + (firstNumber + secondNumber));

    }
}
