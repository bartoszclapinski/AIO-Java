package Methods.Exercise3;

public class Offer {
    Product product;
    double price;
    boolean special;

    public Offer(Product product, double price, boolean special) {
        this.product = product;
        this.price = price;
        this.special = special;
    }

    void printInfo() {
        System.out.println(product.name + " " + product.producer + " " + price + " " + special);
    }
}
