package Encapsulation;

public class DiscountApp {
    public static void main(String[] args) {

        Client client1 = new Client("John", "Smith", true);

        double price = 1100.0;
        double discountPrice = price;

        DiscountService discountService = new DiscountService();
        discountPrice = discountService.calculateDiscountPrice(client1, price);

        System.out.println("Customer: " + client1.getFirstName() + " " + client1.getLastName());
        System.out.println("Price: " + price);
        System.out.println("Discount price: " + discountPrice);

        Client client2 = new Client(null, null, false);
        client2.printInfo();
    }


}

