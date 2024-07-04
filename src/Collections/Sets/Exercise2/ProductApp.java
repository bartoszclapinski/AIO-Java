package Collections.Sets.Exercise2;

import java.util.HashSet;
import java.util.Scanner;

public class ProductApp {

    private static final Scanner scanner = new Scanner(System.in);
    private static final HashSet<Product> products = new HashSet<>();

    public static void main(String[] args) {

        int option = 1;
        while (option != 2) {
            option = showOptions();
            if (option == 1){
                Product product = createProduct();
                if (checkIfProductExists(product)){
                    int optionIfProductExists = showOptionsIfProductExists(product);
                    if (optionIfProductExists == 1){
                        updateProduct(product);
                    }
                } else {
                    addProduct(product);
                }
            }
        }

        scanner.close();
    }

    private static int showOptions() {
        System.out.println("Choose an option: \n(1) Add product\n(2) Exit");
        return scanner.nextInt();
    }

    private static Product createProduct() {
        System.out.println("Enter product name: ");
        String name = scanner.next();
        System.out.println("Enter product price: ");
        double price = scanner.nextDouble();
        return new Product(name, price);
    }

    private static boolean checkIfProductExists(Product product) {
        return products.contains(product);
    }

    private static int showOptionsIfProductExists(Product product) {
        System.out.println("Product already exists: " + products.stream().filter(p -> p.equals(product)).findFirst().get());
        System.out.println("Choose an option: \n(1) Update product\n(2) Exit");
        return scanner.nextInt();
    }

    private static void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added");
    }

    private static void updateProduct(Product product){
        System.out.println("Updating product: " + products.stream().filter(p -> p.equals(product)).findFirst().get());
        System.out.println("Enter new product price: ");
        double price = scanner.nextDouble();
        product.setPrice(price);
        System.out.println("Product updated: " + product);
    }
}
