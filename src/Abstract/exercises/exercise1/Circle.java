package Abstract.exercises.exercise1;

public class Circle implements Shape {

        private final double radius;

        public Circle(double radius) {
            if (radius <= 0) {
                throw new IllegalArgumentException("Radius must be positive");
            }
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * PI * radius;
        }
}
