package Static;

import java.util.Scanner;

public class PrintNumbers {

    private static final int EXIT = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Insert first number: ");
            int first = sc.nextInt();
            System.out.println("Insert second number: ");
            int second = sc.nextInt();
            printNumbers(first, second);
            printNumbers(first);
            printNumbers(second);
            System.out.println("Insert " + EXIT + " to exit or any other number to continue: ");
        } while (sc.nextInt() != EXIT);

        sc.close();
    }

    private static void printNumbers(int first, int second) {
        for (int i = first; i <= second; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printNumbers(int first) {
        for (int i = 0; i <= first; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
