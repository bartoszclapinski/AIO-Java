package CollectionsOperations.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> userNumbers = new ArrayList<>();

        System.out.println("Enter 6 numbers between 1 and 49: ");
        
        while (userNumbers.size() < 6) {
            System.out.print("Enter number " + (userNumbers.size() + 1) + ": ");
            int number = scanner.nextInt();
            if (number >= 1 && number <= 49) {
                userNumbers.add(number);
            } else if (userNumbers.contains(number)) {
                System.out.println("Number already entered. Please enter a unique number.");
            } else {
                System.out.println("Invalid number. Please enter a number between 1 and 49.");
            }
        }

        System.out.println("Your numbers: " + userNumbers);
        
        LottoService lottoService = new LottoService();
        lottoService.generate();
        lottoService.randomize();

        System.out.println("Winning numbers: " + lottoService.getWinningNumbers());
        System.out.println("You matched " + lottoService.checkResult(userNumbers) + " numbers.");

        scanner.close();
    }
}
