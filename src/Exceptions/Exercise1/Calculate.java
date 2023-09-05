package Exceptions.Exercise1;

public class Calculate {

    public static double calculate (double a, double b, String operator) throws UnknownOperatorException {
        double result = 0;

        switch (operator) {
            case "+" -> result = add(a, b);
            case "-" -> result = subtract(a, b);
            case "*" -> result = multiply(a, b);
            case "/" -> {
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by 0");
                }
                result = divide(a, b);
            }
            default -> throw new UnknownOperatorException("Unknown operator");
        }
        return result;
    }

    private static double add (double a, double b) {
        return a + b;
    }

    private static double subtract (double a, double b) {
        return a - b;
    }

    private static double multiply (double a, double b) {
        return a * b;
    }

    private static double divide (double a, double b) {
        return a / b;
    }
}
