package Enum.Exercise1;

public class Pizzeria {
    public static void main(String[] args) {
        Pizza pizza = Pizza.CAPRICIOSA;
        System.out.println(pizza);
        System.out.println(pizza.isCheese());
        System.out.println(pizza.isHam());
        System.out.println(pizza.isMushrooms());
        System.out.println(pizza.isTomatoSauce());
        System.out.println(pizza.name() + " " + pizza.ordinal());

        Pizza[] values = Pizza.values();
        for (Pizza value : values) {
            System.out.println(value);
        }
    }
}
