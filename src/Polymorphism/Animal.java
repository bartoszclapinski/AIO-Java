package Polymorphism;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void giveSound() {
        System.out.println("Animal sound, my name is " + name + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
