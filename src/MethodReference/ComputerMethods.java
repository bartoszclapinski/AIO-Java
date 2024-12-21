package MethodReference;

import java.util.List;
import java.util.function.Consumer;

public class ComputerMethods {
    public static void main(String[] args) {
        List<Computer> computers = List.of(
            new Computer("Lenovo", 3000, 45),
            new Computer("HP", 3200, 66),
            new Computer("Apple", 3400, 78),
            new Computer("Asus", 2800, 42)
        );

        consume(computers, c -> {
            String text = c.getName() + " " + c.getCpu();
            if (c.getTemperature() >= 50) text += " / hot";
            else text += " / cold";
            System.out.println(text);
        });
    }

    private static void consume(List<Computer> computers, Consumer<Computer> consumer) {
        for (Computer computer : computers) {
            consumer.accept(computer);
        }
    }
}
