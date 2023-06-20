package Conditions.Exercise2;

import java.util.Random;

public class NumberInfo {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10000);
        System.out.println("Number is: " + number);

        if (number < 5000) System.out.println("Number is less than 5000");
        else if (number > 5000) System.out.println("Number is greater than 5000");
        else System.out.println("Number is equal to 5000");

        if (number % 2 == 0) System.out.println("Number is even");
        else System.out.println("Number is odd");

        System.out.println(checkNumber(number));
    }

    private static int checkNumber(int number) {
        if (number > 999) return number;
        else if (number == 0) return 0;
        else if (number > 99) return number * 10;
        else if (number > 9) return number * 100;
        else return number * 1000;
    }
}
