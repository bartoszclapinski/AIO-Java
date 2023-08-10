package Polymorphism.Exercise2;

public class Attacker extends Player{
    private double attackBonus;

    public Attacker(String name, double attack, double defense, double energy, double attackBonus) {
        super(name, attack, defense, energy);
        this.attackBonus = attackBonus;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + getName() + ", Attack: " + getAttack()
                + ", Defense: " + getDefense() + ", Energy: " + getEnergy()
                + ", Attack Bonus: " + attackBonus);
    }

    public double getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(double attackBonus) {
        this.attackBonus = attackBonus;
    }

    public double getAttack() {
        return super.getAttack() * (1 + attackBonus);
    }
}
