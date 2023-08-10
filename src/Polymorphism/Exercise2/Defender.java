package Polymorphism.Exercise2;

public class Defender extends Player{
    private double defenseBonus;

    public Defender(String name, double attack, double defense, double energy, double defenseBonus) {
        super(name, attack, defense, energy);
        this.defenseBonus = defenseBonus;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + getName() + ", Attack: " + getAttack()
                + ", Defense: " + getDefense() + ", Energy: " + getEnergy()
                + ", Defense Bonus: " + defenseBonus);
    }

    public double getDefenseBonus() {
        return defenseBonus;
    }

    public void setDefenseBonus(double defenseBonus) {
        this.defenseBonus = defenseBonus;
    }

    public double getDefense() {
        return super.getDefense() * (1 + defenseBonus);
    }
}
