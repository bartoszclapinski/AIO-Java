package InnerClasses;

public class Car {
    private final Engine engine;
    private static int fuel;

    public Car() {
        engine = new Engine("Porsche 3.8 Flat-6");
        System.out.println("Car with " + engine.engineType + " engine created.");
    }

    public void refuel(int liters){
        fuel += liters;
    }

    public void go() throws InterruptedException {
        while (fuel > 0) {
            engine.consumeFuel();
            System.out.println("Car is moving.");
            Thread.sleep(1000);
        }
        System.out.println("No fuel!");
    }

    public class Engine {
        private String engineType;
        private static final int FUEL_CONSUMPTION = 20;

        public Engine(String engineType) {
            this.engineType = engineType;
        }

        public void consumeFuel() {
            if (fuel >= FUEL_CONSUMPTION) {
                fuel = fuel - FUEL_CONSUMPTION;
            } else {
                fuel = 0; // same as Car.this.fuel = 0;
                System.out.println("No fuel!");
            }
        }
    }

    public static class StaticEngine {
        
        private static final int FUEL_CONSUMPTION = 20;

        public StaticEngine(String engineType) {
            
        }

        // fuel field needs to be static
        public void consumeFuel() {
            if (fuel >= FUEL_CONSUMPTION) {
                fuel = fuel - FUEL_CONSUMPTION;
            } else {
                fuel = 0; // same as Car.this.fuel = 0;
                System.out.println("No fuel!");
            }
        }
    }
}
