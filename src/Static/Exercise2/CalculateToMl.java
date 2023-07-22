package Static.Exercise2;

public class CalculateToMl {

    static double cupToMl() {
        return (double) 1 * 250;
    }

    static double spoonToMl() {
        return (double) 1 * 15;
    }

    static double teaSpoonToMl() {
        return (double) 1 * 5;
    }

    public static void main(String[] args) {
        System.out.println("1 cup = " + cupToMl() + "ml");
        System.out.println("1 spoon = " + spoonToMl() + "ml");
        System.out.println("1 tea spoon = " + teaSpoonToMl() + "ml");
    }
}
