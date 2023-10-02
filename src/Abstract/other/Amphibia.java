package Abstract.other;

public class Amphibia implements Boat, Car{
    @Override
    public void print() {
        System.out.println("Amphibia is both a Boat and a Car");
        Car.super.print();
        Boat.super.print();
    }
}
