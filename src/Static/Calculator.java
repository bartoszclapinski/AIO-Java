package Static;

public class Calculator {
    static final double PI = 3.1415927;

    static double circleArea(double r) {
        return PI * r * r;
    }

    static double circlePerimeter(double r) {
        return 2 * PI * r;
    }
}
