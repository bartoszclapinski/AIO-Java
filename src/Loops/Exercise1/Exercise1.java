package Loops.Exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers you want to add?");
        int numbersCount = sc.nextInt();
        int sum = 0;

        System.out.println("Insert numbers: ");
        for (int i = 0; i < numbersCount; i++) {
            sum += sc.nextInt();
        }

        sc.close();
        System.out.println("Sum: " + sum);
    }
}
