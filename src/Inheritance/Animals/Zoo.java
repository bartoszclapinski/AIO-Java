package Inheritance.Animals;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setColor("Black");
        cat.makeSound();
        System.out.println(cat.getColor());

        Bird bird = new Bird();
        bird.setColor("White");
        bird.makeSound();
        System.out.println(bird.getColor());
    }
}
