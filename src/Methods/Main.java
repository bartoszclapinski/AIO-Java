package Methods;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();

        System.out.println(calc.add(1, 2));
        System.out.println(calc.sub(1, 2));
        System.out.println(calc.mul(1, 2));
        System.out.println(calc.div(1, 2));

        calc.addAndPrint(1, 2);
    }
}
