package Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PersonOperators {
    public static void main(String[] args) {

        String[] firstNames = {"John", "Jane", "Jim", "Will", "Alex", "Eric"};
        String[] lastNames = {"Doe", "Smith", "Beam", "Jones", "Williams", "Brown"};
        int[] ages = {25, 30, 35, 40, 45, 16};
        Random random = new Random();
        Supplier<Person> personSupplier = () -> 
            new Person(
                firstNames[random.nextInt(firstNames.length)], 
                lastNames[random.nextInt(lastNames.length)], 
                ages[random.nextInt(ages.length)]
            );

        List<Person> people = generateRandomList(10, personSupplier);
        
        consumeList(people, p -> p.setAge(p.getAge() + 1));
        consumeList(people, p -> System.out.println(p));
        
        List<Person> adults = filterByPredicate(people, p -> p.getAge() >= 18);
        consumeList(adults, p -> System.out.println(p));

        List<Person> allJohns = filterByPredicate(people, p -> p.getFirstName().equals("John"));
        consumeList(allJohns, p -> System.out.println(p));

        List<String> firstNamesOnly = convertList(people, p -> p.getFirstName());
        consumeList(firstNamesOnly, p -> System.out.println(p));
        
    }

    private static <T> List<T> generateRandomList(int elements, Supplier<T> supplier) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < elements; i++) list.add(supplier.get());
        return list;
    }

    private static <T, R> List<R> convertList(List<T> list, Function<T, R> function) {
        List<R> converted = new ArrayList<>();
        for (T t : list) converted.add(function.apply(t));
        return converted;
    }

    private static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T t : list) if (predicate.test(t)) filtered.add(t);
        return filtered;
    }   

    private static <T> void consumeList(List<T> list, Consumer<T> consumer){
        for (T t : list){
            consumer.accept(t);            
        }
    }
}
