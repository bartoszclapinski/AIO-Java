package Collections.Lists.Exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Integer> numbers = new ArrayList<>();

    private static void showStats() {
        System.out.println("Correct numbers inserted: " + numbers.size());
        System.out.println("Sum of numbers: " + numbers.stream().mapToInt(Integer::intValue).sum());
        System.out.println("Average of numbers: " + numbers.stream().mapToInt(Integer::intValue).average().orElse(0));
    }

    private static void readNumbers(){
        System.out.println("Enter positive number divisible by 5: ");
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
            if (number % 5 == 0 && number > 0) {
                numbers.add(number);
                readNumbers();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
            readNumbers();
        }
    }

    public static void main(String[] args) {
        readNumbers();
        showStats();
        scanner.close();
    }

}
