package Inheritance.Vehicles;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setDoors(4);
        car1.setWheels(4);
        car1.setEngine(new Engine());
        car1.getEngine().setPower(100);
        car1.getEngine().setType("Gasoline");
        car1.setFuel(50);

        car1.printDetails();
    }
}
