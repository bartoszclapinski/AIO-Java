package Collections.Lists.Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    private static final List<Integer> numbers = new ArrayList<>();

    private static int addNumbers() {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    private static void printNumbers() {
        System.out.println("Numbers: ");
        numbers.forEach(number -> System.out.print(number + " "));
        System.out.println();
    }


    private static void readNumbersFromUser(){
        System.out.println("Enter number to add or type exit to finish: ");
        String input = scanner.nextLine();
        if (input.equals("exit")) return;
        numbers.add(Integer.parseInt(input));
        readNumbersFromUser();
    }

    public static void main(String[] args) {
        readNumbersFromUser();
        printNumbers();
        System.out.println("Sum of numbers: " + addNumbers());
        scanner.close();
    }
}
