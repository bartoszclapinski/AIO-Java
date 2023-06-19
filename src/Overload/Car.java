package Overload;

public class Car {
    int year;
    String brand;
    String model;
    String color;

    public Car(int year, String brand, String model, String color) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Car(int year, String brand, String model) {
        this(year, brand, model, null);
    }

    void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
