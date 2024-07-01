package Comparable.Exercise1;
import java.util.Arrays;
import java.util.Comparator;

public class CompareNums {
    public static void main(String[] args) {
        //  Create an array of 20 integers
        Integer[] numbers = new Integer[20];

        //  Fill the array with random numbers
        for (int i = 0; i < numbers.length; i++) numbers[i] = (int) (Math.random() * 100);

        //  Print the array
        for (int i : numbers) System.out.print(i + " ");
        System.out.println();

        //  Sort the array in descending order
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });

        //  Print the sorted array
        for (int i : numbers) System.out.print(i + " ");
        System.out.println();

        //  Sort the array
        Arrays.sort(numbers);

        //  Print the sorted array
        for (int i : numbers) System.out.print(i + " ");

    }
}
