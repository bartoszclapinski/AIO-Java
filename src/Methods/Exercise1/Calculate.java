package Methods.Exercise1;

public class Calculate {
    public static void main(String[] args) {
        double a = 234.4;
        double b = 4.2;

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(a, b));
        System.out.println(calculator.subtract(a, b));
        System.out.println(calculator.multiply(a, b));
        System.out.println(calculator.divide(a, b));

    }
}
