package Polymorphism;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];

        animals[0] = new Dog("Dog");
        animals[1] = new Cat("Cat");
        animals[2] = new Animal("Animal");

        for (Animal animal : animals) {
            animal.giveSound();
        }

        changeAnimalName(animals[0], "Doggy");
        changeAnimalName(animals[1], "Kitty");
        changeAnimalName(animals[2], "Animaly");

        for (Animal animal : animals) {
            animal.giveSound();
        }

        // animals[0].bark(); Error: cannot find symbol
        // animals[1].meow(); Error: cannot find symbol

        Dog dog = new Dog("Dog");
        Cat cat = new Cat("Cat");

        dog.bark();
        cat.meow();

        Animal animal = new Animal("Dog");
        animal.giveSound();
        //((Dog)animal).bark();
        // ((Cat)animal).meow(); Error: java.lang.ClassCastException: Polymorphism.Animal cannot be cast to Polymorphism.Cat

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose animal type: 1 - Dog, 2 - Cat");
        int choice = sc.nextInt();

        if (choice == 1) {
            animal = new Dog("Dog");
        } else if (choice == 2) {
            animal = new Cat("Cat");
        }

        if (animal instanceof Dog) {
            ((Dog)animal).bark();
        } else if (animal instanceof Cat) {
            ((Cat)animal).meow();
        } else {
            System.out.println("Wrong choice!");
        }
        sc.close();
    }

    private static void changeAnimalName(Animal animal, String newName) {
        animal.setName(newName);
    }
}
