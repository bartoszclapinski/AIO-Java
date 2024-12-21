package Comparable;
import java.util.Arrays;

public class ProductCatalog {
    public static void main(String[] args) {

        Product p1 = new Product("Apple", "Apple Inc.", 1.0);
        Product p2 = new Product("Banana", "Banana Inc.", 2.0);
        System.out.println(p1.compareTo(p2));

        Product[] products = new Product[7];
        products[0] = new Product("John", "Apple Inc.", 7.0);
        products[1] = new Product("Mary", "Banana Inc.", 7.0);
        products[2] = new Product("Bob", "Apple Inc.", 7.0);
        products[3] = new Product("Ann", "Banana Inc.", 4.0);
        products[4] = new Product("Jane", "Apple Inc.", 5.0);
        products[5] = new Product("Kate", "Orange Inc.", 6.0);
        products[6] = new Product("Greg", "Orange Inc.", 7.0);

        System.out.println("Products not sorted: ");
        for (Product p : products) System.out.println(p);

        Arrays.sort(products);
        System.out.println("Products sorted: ");
        for (Product p : products) System.out.println(p);

        ProductNameComparator pnc = new ProductNameComparator();
        Arrays.sort(products, pnc);
        System.out.println("Products sorted by name: ");
        for (Product p : products) System.out.println(p);

        Arrays.sort(products, (o1, o2) -> o1.getProducer().compareTo(o2.getProducer()));
        System.out.println("Products sorted by producer: ");
        for (Product p : products) System.out.println(p);
    }
}
