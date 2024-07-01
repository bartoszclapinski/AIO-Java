package Comparable.Exercise2;

public class Estate implements Comparable<Estate> {
    private String city;
    private double price;
    private int area;

    public Estate(String city, double price, int area) {
        this.city = city;
        this.price = price;
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getPricePerSquareMeter() {
        return price / area;
    }



    @Override
    public String toString() {
        return "Estate{" +
                "city='" + city + '\'' +
                ", price=" + price +
                ", area=" + area +
                '}';
    }

    @Override
    public int compareTo(Estate o) {
        return Double.compare(this.getPricePerSquareMeter(), o.getPricePerSquareMeter());
    }
}
