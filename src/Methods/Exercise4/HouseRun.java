package Methods.Exercise4;

public class HouseRun {
    public static void main(String[] args) {
        House house1 = new House(10_000.0, 1_000.0);
        house1.printInfo();

        house1.takeShower();
        house1.printInfo();

        house1.watchTv(4);
        house1.printInfo();

        house1.boilWater();
        house1.printInfo();
    }
}
