package Polymorphism;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void giveSound() {
        System.out.println("Woof woof, my name is " + getName() + ".");
    }

    public void bark() {
        System.out.println("Bark bark, my name is " + getName() + ".");
    }
}
