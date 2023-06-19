package Methods.Exercise3;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Processor", "Intel");
        Offer offer1 = new Offer(product1, 1999.99, false);
        offer1.printInfo();
    }
}
