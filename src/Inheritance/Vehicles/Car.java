package Inheritance.Vehicles;

public class Car extends WheeledVehicle {
    private int doors;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void printDetails() {
        System.out.println("This car has " + getWheels() + " wheels, " + doors + " doors, " + getEngine().getPower() +
                " horsepower, and is a " + getEngine().getType() + ".");
    }
}
