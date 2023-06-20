package Overload.Exercise1;

public class Calculator {

    int add (int number1, int number2) {
        return number1 + number2;
    }

    int add (int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    double add (double number1, double number2) {
        return number1 + number2;
    }

    double add (double number1, double number2, double number3) {
        return number1 + number2 + number3;
    }

    int subtract (int number1, int number2) {
        return number1 - number2;
    }

    int subtract (int number1, int number2, int number3) {
        return number1 - number2 - number3;
    }

    double subtract (double number1, double number2) {
        return number1 - number2;
    }

    double subtract (double number1, double number2, double number3) {
        return number1 - number2 - number3;
    }
}
