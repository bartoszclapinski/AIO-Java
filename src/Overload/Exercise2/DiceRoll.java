package Overload.Exercise2;

public class DiceRoll {
    public static void main(String[] args) {
        Dice dice = new Dice();
        dice.printInfo();

        dice.roll();
        dice.printInfo();

        dice.roll();
        dice.printInfo();
    }
}
