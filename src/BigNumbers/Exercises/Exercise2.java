package BigNumbers.Exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Count how many numbers are in the text and how many letters are in the text.
        // Check the highest digit in the text.
        int countDigits = 0;
        int countLetters = 0;
        int highestDigit = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                countDigits++;
                int i1 = Integer.parseInt(String.valueOf(text.charAt(i)));
                if (i1 > highestDigit) {
                    highestDigit = i1;
                }
            } else if (Character.isLetter(text.charAt(i))) {
                countLetters++;
            }
        }
        System.out.println("Number of digits: " + countDigits);
        System.out.println("Number of letters: " + countLetters);
        System.out.println("Highest digit: " + highestDigit);

    }
}
