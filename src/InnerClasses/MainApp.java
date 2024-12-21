package InnerClasses;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        car.refuel(80);
        car.go();

        Car.Engine engine = car.new Engine("Porsche 3.8 Flat-6");
        Car.StaticEngine staticEngine = new Car.StaticEngine("Porsche 3.8 Flat-6");

        engine.consumeFuel();
        staticEngine.consumeFuel();
    }
}
