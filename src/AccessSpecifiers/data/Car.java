package AccessSpecifiers.data;

public class Car {
    protected int year;
    private String brand;
    private String model;
    private String color;

    public Car(int year, String brand, String model, String color) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Car(int year, String brand, String model) {
        this(year, brand, model, null);
    }

    public void setYear(int year) {
        if (year < 1900 || year > 2022) {
            System.out.println("Invalid year");
            return;
        }
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void printCarInfo() {
        System.out.println(this.brand + " " + this.model + " " + this.color);
    }

}
