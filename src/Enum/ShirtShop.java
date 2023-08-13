package Enum;

public class ShirtShop {
    public static void main(String[] args) {
        System.out.println(Size.LARGE.getDescription());

        String size = "MEDIUM";
        Size sizeEnum = Size.valueOf(size);

        Shirt shirt = new Shirt();
        shirt.setSize(sizeEnum);

        System.out.println(shirt.getSize());
        System.out.println(shirt.getSize().getDescription());
        System.out.println(Size.SMALL.name() + " " + Size.SMALL.ordinal());

        Size[] values = Size.values();
        for (Size value : values) {
            System.out.println(value);
        }

        String description = "M";
        Size size1 = Size.fromDescription(description);
        System.out.println(size1);
    }
}
