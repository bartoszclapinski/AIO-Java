package Static;

public class World {
    public static void main(String[] args) {
        Human adam = new Human("Adam", 178);
        Human eve = new Human("Eve", 165);

        Human.avgHeight = (adam.getHeight() + eve.getHeight()) / 2;

        System.out.println("First humans on Earth:");
        System.out.println(adam.getName() + " is " + adam.getHeight() + "cm tall");
        System.out.println(eve.getName() + " is " + eve.getHeight() + "cm tall");

        System.out.println("Average height of humans is: " + Human.avgHeight + "cm");
        System.out.println(adam.avgHeight);
        System.out.println(eve.avgHeight);
    }
}
