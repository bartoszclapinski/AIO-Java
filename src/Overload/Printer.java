package Overload;

public class Printer {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();
        numberPrinter.printNumber(1);
        numberPrinter.printNumber(1, 2);
        numberPrinter.printNumber(1, 2, 3);
    }
}
