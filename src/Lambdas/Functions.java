package Lambdas;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functions {
    public static void main(String[] args) {
        String original = "    Hello World  ";
        String trimmed = lowerCaseTrim(original);
        System.out.println(trimmed);       


        // Function Interface - Apply
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String str) {
                return str.toLowerCase().trim();
            }
        };
        String result = function.apply(original);
        System.out.println(result);

        Function<String, String> function2 = str -> str.toLowerCase().trim();
        String result2 = function2.apply(original);
        System.out.println(result2);

        // Consumer Interface - Accept
        Consumer<String> consumer = str -> {
            System.out.println(str);
            System.out.println(str);
            System.out.println(str);
        };
        consumer.accept(original);

        int personAge = 25;
        Predicate<Integer> predicate = age -> age >= 18;
        boolean isAdult = predicate.test(personAge);
        System.out.println(isAdult);

        String[] firstNames = {"John", "Jane", "Jim", "Jill"};
        String[] lastNames = {"Doe", "Smith", "Jones", "Williams"};
        int[] ages = {25, 30, 35, 40};
        Random random = new Random();

        Supplier<Person> suplier = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        };

        for (int i = 0; i < 10; i++) {            
            System.out.println(suplier.get());
        }

    }

    static String lowerCaseTrim(String str) {
        return str.toLowerCase().trim();
    }
}
