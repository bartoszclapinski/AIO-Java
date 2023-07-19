package Loops.Exercise3;

import java.util.Scanner;

public class TemperatureControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert actual temperature: ");
        int actual = sc.nextInt();
        System.out.println("Insert expected temperature: ");
        int expected = sc.nextInt();

        while (actual != expected) {
            if (actual < expected) {
                System.out.println("Actual temperature is lower than expected. Increasing...");
                actual++;
            } else {
                System.out.println("Actual temperature is higher than expected. Decreasing...");
                actual--;
            }

            System.out.println("Actual temperature: " + actual);
        }

    }
}
