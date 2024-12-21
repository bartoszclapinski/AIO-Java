package Overload;

public class CarShop {
    public static void main(String[] args) {

        Car car1 = new Car(2010, "Audi", "A4", "black");

        Car car2 = new Car(2018, "BMW", "i8");

        car1.printInfo();
        car2.printInfo();
    }
}
