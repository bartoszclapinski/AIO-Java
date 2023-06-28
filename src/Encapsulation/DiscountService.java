package Encapsulation;

public class DiscountService {

    public double calculateDiscountPrice(Client client, double price) {
        if (client.isPremiumCustomer()) {
            return calculatePremiumDiscountPrice(price);
        } else {
            return calculateStandardDiscountPrice(price);
        }
    }

    private double calculateStandardDiscountPrice(double price) {
        if (price > 1000) {
            return applyDiscount(price, 0.1);
        } else {
            return price;
        }
    }

    private double calculatePremiumDiscountPrice(double price) {
        if (price > 1000) {
            return applyDiscount(price, 0.15);
        } else {
            return applyDiscount(price, 0.05);
        }
    }

    private double applyDiscount(double price, double discount) {
        return price * (1 - discount);
    }

}