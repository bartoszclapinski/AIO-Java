package Conditions;

import java.util.Random;

public class Conditions {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(100) - 5;
        int b = random.nextInt(100) - 5;
        int c = random.nextInt(100) - 5;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        boolean aIsPositive = a > 0;
        boolean aIsEven = a % 2 == 0;

        if (aIsPositive && aIsEven) {
            System.out.println("a is positive and even");
        } else if (aIsPositive && !aIsEven) {
            System.out.println("a is positive and odd");
        } else if (!aIsPositive && aIsEven) {
            System.out.println("a is negative and even");
        } else {
            System.out.println("a is negative and odd");
        }
    }
}
