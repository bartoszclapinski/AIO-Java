package Comparable;

public class Product implements Comparable<Product> {
    private String name;
    private String producer;
    private double price;

    public Product(String name, String producer, double price) {
        this.name = name;
        this.producer = producer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", producer='" + producer + '\'' + ", price=" + price + '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.price > o.getPrice()) return 1;
        else if (this.price < o.getPrice()) return -1;

        int producerComparison = this.producer.compareTo(o.getProducer());
        if (producerComparison != 0) return producerComparison;

        return this.name.compareTo(o.getName());
    }
}
