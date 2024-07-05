package Collections.Maps.Exercise2;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, TreeSet<Product>> products = new HashMap<>();
    private static final String FILE_PATH = "src/Collections/Maps/Exercise2/products.txt";

    private static void getProductsFromFile(){
        try {
            Scanner fileScanner = new Scanner(new File(FILE_PATH));
            while (fileScanner.hasNextLine()){
                String[] productData = fileScanner.nextLine().split(";");
                Product product = new Product(productData[0], productData[1], Double.parseDouble(productData[2]));
                if(products.containsKey(product.getCategory())){
                    products.get(product.getCategory()).add(product);
                } else {
                    TreeSet<Product> productsSet = new TreeSet<>();
                    productsSet.add(product);
                    products.put(product.getCategory(), productsSet);
                }
            }
        } catch (Exception e) {
            System.out.println("File not found.");
        }
    }

    private static void showAllProductsFromGivenCategory(){
        String category = getCategoryFromUser();
        if(products.containsKey(category)){
            products.get(category).forEach(System.out::println);
            showProductsDataForCategory(category);

        } else {
            System.out.println("Category not found.");
        }
    }

    private static String getCategoryFromUser(){
        System.out.println("Enter category: ");
        return scanner.nextLine();
    }

    private static void showProductsDataForCategory(String category){
        double sum = 0;
        for(Product product : products.get(category)) sum += product.getPrice();
        System.out.println("Average price of products in category " + category + " is: " + sum / products.get(category).size());
        System.out.println(products.get(category).first());
        System.out.println(products.get(category).last());
    }

    public static void main(String[] args) {
        getProductsFromFile();
        showAllProductsFromGivenCategory();

        scanner.close();
    }

}
