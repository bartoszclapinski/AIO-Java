package Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; ++i) {
            System.out.println("Insert number: ");
            int number = scanner.nextInt();
            if (number % 2 == 0) System.out.println("Even");
            else System.out.println("Odd");
        }

        int[] numbers2 = { 1, 2, 3, 4, 5 };
        for (int number : numbers2) {
            System.out.println(number);
        }

        scanner.close();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) break;
            System.out.println(i);
        }

        int[] tab = { 1, 2, 3, 4, 5 };
        for (int j : tab) {
            System.out.println(j);
        }


    }
}
