package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[2];
        boolean error = true;
        do {
            try {
                System.out.println("Enter first number: ");
                numbers[0] = scanner.nextInt();
                System.out.println("Enter second number: ");
                numbers[1] = scanner.nextInt();
                System.out.println("Which element you want to display? 1 or 2?");
                int choice = scanner.nextInt();
                System.out.println("Element " + choice + " = " + numbers[choice - 1]);
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("You entered a value that is not a number.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds.");
            } finally {
                System.out.println("Finally block.");
                System.out.println("Sum of numbers: " + (numbers[0] + numbers[1]));
                scanner.nextLine();
            }
        } while (error);
        scanner.close();
    }
}
