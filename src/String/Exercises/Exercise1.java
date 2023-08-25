package String.Exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many words you want to enter: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        String temp = "";
        for (int i = 0; i < size; i++) {
            System.out.println("Enter word: ");
            temp = scanner.nextLine();
            sb.append(temp.charAt(temp.length() - 1));
        }
        System.out.println(sb.toString());
        scanner.close();
    }
}
