package Overload.Exercise1;

public class CalcTest {
    public static void main(String[] args) {

            Calculator calculator = new Calculator();

            System.out.println(calculator.add(2, 3));
            System.out.println(calculator.add(2, 3, 4));
            System.out.println(calculator.add(2.5, 3.5));
            System.out.println(calculator.add(2.5, 3.5, 4.5));

            System.out.println(calculator.subtract(2, 3));
            System.out.println(calculator.subtract(2, 3, 4));
            System.out.println(calculator.subtract(2.5, 3.5));
            System.out.println(calculator.subtract(2.5, 3.5, 4.5));
    }
}
