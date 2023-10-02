package Abstract.interfaces;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Shape.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Shape.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Shape.PI * radius;
    }
}
