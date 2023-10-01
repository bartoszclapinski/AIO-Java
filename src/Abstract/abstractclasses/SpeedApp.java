package Abstract.abstractclasses;

public class SpeedApp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle plane = new Plane();

        car.speedUp();
        plane.speedUp();

        System.out.println("Car speed: " + car.getSpeed());
        System.out.println("Plane speed: " + plane.getSpeed());
    }
}
