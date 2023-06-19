package Methods.Exercise4;

public class House {
    double water;
    double oil;

    public House(double water, double oil) {
        this.water = water;
        this.oil = oil;
    }

    void takeShower() {
        System.out.println("You took a shower");
        water -= 48;
    }

    void takeBath() {
        System.out.println("You took a bath");
        water -= 86;
    }

    void makeDinner() {
        System.out.println("You made dinner");
        oil -= 0.1;
        water -= 4;
    }

    void boilWater() {
        System.out.println("You boiled water");
        oil -= 0.05;
        water -= 0.5;
    }

    void watchTv(int hours) {
        System.out.println("You watched TV for " + hours + " hours");
        oil -= 0.06 * hours;
    }

    void printInfo() {
        System.out.println("Water: " + water + " Oil: " + oil);
    }
}
