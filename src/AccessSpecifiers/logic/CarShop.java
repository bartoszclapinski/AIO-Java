package AccessSpecifiers.logic;

import AccessSpecifiers.data.Car;

public class CarShop {
    public static void main(String[] args) {
        Car car1 = new Car(2018, "Toyota", "Corolla", "Black");
        Car car2 = new Car(2022, "Toyota", "Corolla");

        car2.setColor("Manhattan Grey");

        car1.printCarInfo();
        car2.printCarInfo();
    }
}
