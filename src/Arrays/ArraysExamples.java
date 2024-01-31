package Arrays;
import GenericTypes.IntContainer;

import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {
        String[] names = {"John", "Mary", "Bob", "Ann", "Jane", "Kate", "Greg"};
        Integer[] numbers = {4, 2, 3, 8, 5, 1, 7, 6};

        System.out.println("Names: ");
        print(names);
        System.out.println("Numbers: ");
        print(numbers);

        // Arrays.sort
        System.out.println("Sorted names: ");
        Arrays.sort(names);
        print(names);
        System.out.println("Sorted numbers: ");
        Arrays.sort(numbers);
        print(numbers);

        // Arrays.binarySearch
        System.out.println("Binary search for 'Bob': ");
        System.out.println(Arrays.binarySearch(names, "Bob"));

        // Arrays.copyOf
        System.out.println("Copy of names: ");
        String[] namesCopy = Arrays.copyOf(names, 3);
        print(namesCopy);
        System.out.println("Copy of numbers: ");
        Integer[] numbersCopy = Arrays.copyOf(numbers, 3);
        print(numbersCopy);

        // Arrays.equals
        System.out.println("Are names and namesCopy equal? ");
        System.out.println(Arrays.equals(names, namesCopy));
        System.out.println("Are numbers and numbersCopy equal? ");
        System.out.println(Arrays.equals(numbers, numbersCopy));
        String[] namesEqualCopy = Arrays.copyOf(names, names.length);
        System.out.println("Are names and namesEqualCopy equal? ");
        System.out.println(Arrays.equals(names, namesEqualCopy));
        Integer[] numbersEqualCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Are numbers and numbersEqualCopy equal? ");
        System.out.println(Arrays.equals(numbers, numbersEqualCopy));

        // Arrays.fill
        System.out.println("Fill namesCopy with 'Bob': ");
        String[] namesFilled = new String[names.length];
        Arrays.fill(namesFilled, "Bob");
        print(namesFilled);

        // System.arraycopy
        Integer[] numbersSystemCopy = new Integer[5];
        System.arraycopy(numbers, 2, numbersSystemCopy, 0, numbers.length-3);
        print(numbersSystemCopy);
    }

    private static <T> void print (T[] arr){
        for (T i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
