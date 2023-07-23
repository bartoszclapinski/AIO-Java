package Inheritance.Animals;

public class Animal {
    private String color;



    public void makeSound(){
        System.out.println("Animal sound");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
