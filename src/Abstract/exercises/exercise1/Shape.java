package Abstract.exercises.exercise1;

public interface Shape {
    double PI = 3.141592653589793;

    double calculateArea();
    double calculatePerimeter();

    default String getData() {
        return "Area: " + calculateArea() + "\nPerimeter: " + calculatePerimeter() + "\n";
    };
}
