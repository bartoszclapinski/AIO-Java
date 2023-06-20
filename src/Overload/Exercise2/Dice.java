package Overload.Exercise2;

import java.util.Random;

public class Dice {
    int top;
    Random random = new Random();

    Dice() {
        roll();
    }

    Dice(int top) {
        this.top = top;
    }

    void roll() {
        this.top = random.nextInt(6) + 1;
    }

    void printInfo() {
        System.out.println("Top: " + this.top);
    }
}
