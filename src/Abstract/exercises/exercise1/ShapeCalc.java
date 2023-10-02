package Abstract.exercises.exercise1;

import java.util.Scanner;

public class ShapeCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rectangle - 1, Circle - 2, Triangle - 3");
        System.out.println("Enter shape type: ");
        int result = scanner.nextInt();
        switch (result) {
            case 1 -> {
                System.out.println("Enter length: ");
                double width = scanner.nextDouble();
                System.out.println("Enter width: ");
                double height = scanner.nextDouble();
                Shape rectangle = new Rectangle(width, height);
                System.out.println(rectangle.getData());
            }
            case 2 -> {
                System.out.println("Enter radius: ");
                double radius = scanner.nextDouble();
                Shape circle = new Circle(radius);
                System.out.println(circle.getData());
            }
            case 3 -> {
                System.out.println("Enter side A: ");
                double sideA = scanner.nextDouble();
                System.out.println("Enter side B: ");
                double sideB = scanner.nextDouble();
                System.out.println("Enter side C: ");
                double sideC = scanner.nextDouble();
                Shape triangle = new Triangle(sideA, sideB, sideC);
                System.out.println(triangle.getData());
            }
            default -> System.out.println("Wrong shape type");
        }
        scanner.close();
    }
}
