package Lambdas;

import java.util.function.Consumer;
import java.util.function.Function;

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

    }

    static String lowerCaseTrim(String str) {
        return str.toLowerCase().trim();
    }
}
