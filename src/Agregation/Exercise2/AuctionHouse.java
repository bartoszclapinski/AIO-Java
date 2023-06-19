package Agregation.Exercise2;

public class AuctionHouse {
    public static void main(String[] args) {

        Address address1 = new Address();
        address1.street = "Main Street";
        address1.houseNumber = "1";
        address1.flatNumber = "1";
        address1.city = "New York";
        address1.country = "USA";
        address1.postalCode = "12345";

        Person person1 = new Person();
        person1.firstName = "John";
        person1.lastName = "Smith";
        person1.houseAddress = address1;

        Auction auction1 = new Auction();
        auction1.title = "Xbox One";
        auction1.description = "Xbox One 500GB";
        auction1.price = 999.99;
        auction1.seller = person1;

        Person person2 = new Person();
        person2.firstName = "Jane";
        person2.lastName = "Doe";
        person2.houseAddress = null;

        Auction auction2 = new Auction();
        auction2.title = "Samsung S20";
        auction2.description = "Samsung S20 128GB";
        auction2.price = 3999;
        auction2.seller = person2;

        System.out.println("Auction 1:");
        System.out.println("Title: " + auction1.title);
        System.out.println("Description: " + auction1.description);
        System.out.println("Price: " + auction1.price);
        System.out.println("Seller: " + auction1.seller.firstName + " " + auction1.seller.lastName);

        System.out.println("Auction 2:");
        System.out.println("Title: " + auction2.title);
        System.out.println("Description: " + auction2.description);
        System.out.println("Price: " + auction2.price);
        System.out.println("Seller: " + auction2.seller.firstName + " " + auction2.seller.lastName);
    }
}
