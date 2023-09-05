package Exceptions.Exercise1;

import static Exceptions.Exercise1.Calculate.calculate;

public class CalcApp {
    public static void main(String[] args) {

        try {
            System.out.println(calculate(2, 4, "+"));
            System.out.println(calculate(2, 4, "-"));
            System.out.println(calculate(2, 4, "*"));
            System.out.println(calculate(2, 4, "/"));
            System.out.println(calculate(2, 4, "%"));
            System.out.println(calculate(2, 4, "x"));
        } catch (UnknownOperatorException e) {
            System.err.println(e.getMessage());
        }
    }

}
