package Abstract.exercises.exercise1;

public class Triangle implements Shape {

        private final double sideA;
        private final double sideB;
        private final double sideC;

        public Triangle(double sideA, double sideB, double sideC) {
            if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
                throw new IllegalArgumentException("Sides must be positive");
            }
            if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
                throw new IllegalArgumentException("Sides must be valid");
            }
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        @Override
        public double calculateArea() {
            double s = calculatePerimeter() / 2;
            return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        }

        @Override
        public double calculatePerimeter() {
            return sideA + sideB + sideC;
        }
}
