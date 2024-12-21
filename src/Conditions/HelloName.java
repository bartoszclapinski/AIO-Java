package Conditions;

public class HelloName {
    public static void main(String[] args) {
        String name1 = "John";
        String name2 = "Jane";
        String name3 = "Adam";
        String name4 = "Eve";

        System.out.println("Enabled names: " + name1 + ", " + name2 + ", " + name3 + ", " + name4);

        String name = name4;

        switch (name) {
            case "John" -> System.out.println("Hello John.");
            case "Jane", "Eve" -> System.out.println("Hi " + name + "!");
            case "Adam" -> System.out.println("Welcome Adam.");
            default -> System.out.println("\\_o.O_/");
        }
    }
}
