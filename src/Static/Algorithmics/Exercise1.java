package Static.Algorithmics;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = 0;

        do {
            sum += input;
            System.out.println("Insert number: ");
            input = scanner.nextInt();
        } while (input <= 100);

        if (sum % 2 == 0) System.out.println("Sum is even." + sum);
        else System.out.println("Sum is odd." + sum);
        scanner.close();
    }
}
