package Polymorphism;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void giveSound() {
        System.out.println("Meow meow, my name is " + getName() + ".");
    }

    public void meow() {
        System.out.println("Meeeeeeeooooooowwwww, my name is " + getName() + ".");
    }
}
