package Lambdas.Exercises.Exercise1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomNumberOperations {
    public static void main(String[] args) {
        
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);
        
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(randomSupplier.get());
        }

        Consumer<List<Integer>> displayNumbers = list -> {
            list.forEach(num -> System.out.print(num + " "));
            System.out.println();
        };

        System.out.println("Starting numbers: ");
        displayNumbers.accept(numbers);

        removeIf(numbers, num -> num % 2 == 0);
        
                System.out.println("After removing even numbers: ");
                displayNumbers.accept(numbers);
    }
        
    private static void removeIf(List<Integer> numbers, Predicate<Integer> predicate) {
        Iterator<Integer> iterator = numbers.iterator(); 
        while (iterator.hasNext()) {
            if (predicate.test(iterator.next())) {
                iterator.remove();
            }
        }          
    }
}
