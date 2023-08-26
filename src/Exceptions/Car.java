package Exceptions;

public class Car {
    private static final double FUEL_CONSUMPTION = 8; // 8 [l/100km]
    private static final double MAX_FUEL = 50; // 50 [l]
    private double fuel;

    public void refuel(double additionalFuel) {
        if (fuel + additionalFuel > MAX_FUEL) {
            throw new IllegalArgumentException("The tank is full");
        }
        fuel += additionalFuel;
    }

    public void drive() {
        if (fuel < FUEL_CONSUMPTION) {
            throw new IllegalStateException("There is not enough fuel in the tank");
        }
        fuel -= FUEL_CONSUMPTION;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel=" + fuel +
                '}';
    }
}
