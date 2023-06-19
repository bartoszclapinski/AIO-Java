package ClassesAndObjects;

public class CarShop {
    public static void main(String[] args) {
        //  Create two objects of type Car
        //  car1 is a reference variable of type Car
        Car car1 = new Car();
        car1.brand = "BMW";
        car1.model = "X5";
        car1.color = "Black";
        car1.wheelsColor = "Silver";
        car1.tiresColor = "Black";
        car1.doors = 5;

        System.out.println("Car 1:");
        System.out.println("Brand: " + car1.brand);
        System.out.println("Model: " + car1.model);
        System.out.println("Color: " + car1.color);
        System.out.println("Wheels color: " + car1.wheelsColor);
        System.out.println("Tires color: " + car1.tiresColor);
        System.out.println("Doors: " + car1.doors);

        Car car2 = new Car();
        car2.brand = "Mercedes";
        car2.model = "C-Class";
        car2.color = "White";
        car2.wheelsColor = "Silver";
        car2.tiresColor = "Black";
        car2.doors = 4;

        System.out.println("\nCar 2:");
        System.out.println("Brand: " + car2.brand);
        System.out.println("Model: " + car2.model);
        System.out.println("Color: " + car2.color);
        System.out.println("Wheels color: " + car2.wheelsColor);
        System.out.println("Tires color: " + car2.tiresColor);
        System.out.println("Doors: " + car2.doors);
    }
}
