package ReadingFromUser.Exercise1;

public class Calculate {

    public void calculate(char operator, double num1, double num2){
        switch (operator){
            case '+' -> System.out.println(add(num1, num2));
            case '-' -> System.out.println(subtract(num1, num2));
            case '*' -> System.out.println(multiply(num1, num2));
            case '/' -> System.out.println(divide(num1, num2));
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        }

    }

    private double add(double num1, double num2) {
        return num1 + num2;
    }

    private double subtract(double num1, double num2) {
        return num1 - num2;
    }

    private double multiply(double num1, double num2) {
        return num1 * num2;
    }

    private double divide(double num1, double num2) {
        return num1 / num2;
    }
}
