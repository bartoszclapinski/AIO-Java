package Recursion.Exercises.Exercise2;

public class Cart {
    private Product[] products;
    private int index;

    public Cart() {
        products = new Product[10];
        index = 0;
    }

    public void add(Product product){
        if (index == products.length) {
            System.out.println("Cart is full");
            return;
        }
        products[index] = product;
        index++;
        System.out.println("Product added to cart");
    }

    public double totalCost(int productIndex){
        return totalCost(products.length - 1);
    }

}
