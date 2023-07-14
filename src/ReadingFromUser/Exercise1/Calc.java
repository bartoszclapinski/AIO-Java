package ReadingFromUser.Exercise1;

public class Calc {
    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Insert first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Insert operator: ");
        char operator = sc.next().charAt(0);
        sc.nextLine();

        System.out.println("Insert second number: ");
        double num2 = sc.nextDouble();

        sc.close();

        new Calculate().calculate(operator, num1, num2);
    }
}
