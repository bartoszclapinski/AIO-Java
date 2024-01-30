package BigNumbers.Exercises;

import BigNumbers.BigNumbers;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        File file = new File("src/BigNumbers/Exercises/numbers.txt");

        try (Scanner scanner = new Scanner(file)) {
            int sum = scanner.nextInt() + scanner.nextInt() + scanner.nextInt();
            BigInteger bigSum = new BigInteger(String.valueOf(scanner.nextBigInteger()));
            bigSum = bigSum.add(new BigInteger(String.valueOf(scanner.nextBigInteger())));
            System.out.println("Sum: " + sum);
            System.out.println("Big sum: " + bigSum);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found: " + file.getAbsolutePath());
        }
    }
}
