package Inheritance.Exercise1;

public class Test {
    public static void main(String[] args) {
        ExhaustPart exhaustPart = new ExhaustPart();
        exhaustPart.setId(1);
        exhaustPart.setProducer("Bosch");
        exhaustPart.setModel("Bosch 123");
        exhaustPart.setSeries("Bosch 123 456");
        exhaustPart.setEuro3(true);
        System.out.println(exhaustPart.getId());
        System.out.println(exhaustPart.getProducer());
        System.out.println(exhaustPart.getModel());
        System.out.println(exhaustPart.getSeries());
        System.out.println(exhaustPart.isEuro3());
    }
}
