package Debug;

import java.util.Scanner;
import java.util.stream.IntStream;

public class DebugExample {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = getArraySize();
        int[] array = createArray(size);
        int multiplier = getMultiplier();
        multiplyAllNumbersBy(array, multiplier);
        printArray(array);
    }

    private static int getArraySize() {
        System.out.println("Insert array size: ");
        return scanner.nextInt();
    }

    private static int[] createArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Insert number: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int getMultiplier() {
        System.out.println("Insert multiplier: ");
        return scanner.nextInt();
    }

    private static void multiplyAllNumbersBy(int[] array, int multiplier) {
        IntStream.range(0, array.length).forEach(i -> array[i] *= multiplier);
    }

    private static void printArray(int[] array) {
        System.out.println("Array: ");
        IntStream.range(0, array.length).forEach(i -> System.out.print(array[i] + " "));
    }
}
