package Overload;

public class NumberPrinter {

    void printNumber(int number1) {
        System.out.println(number1);
    }

    void printNumber(int number1, int number2) {
        System.out.println(number1 + ", " + number2);
    }

    void printNumber(int number1, int number2, int number3) {
        System.out.println(number1 + ", " + number2 + ", " + number3);
    }
}
