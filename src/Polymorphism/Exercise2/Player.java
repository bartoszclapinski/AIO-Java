package Polymorphism.Exercise2;

public class Player {
    private String name;
    private double attack;
    private double defense;
    private double energy;

    public Player(String name, double attack, double defense, double energy) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.energy = energy;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Attack: " + attack
                + ", Defense: " + defense + ", Energy: " + energy);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }
}
