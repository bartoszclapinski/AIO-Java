package Conditions;

import java.util.Scanner;

public class SwitchSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose size: ");
        int size = scanner.nextInt();

        String result = switch (size) {
            case 8 -> {
                System.out.println("Small");
                yield "Small2";
            }
            case 10 -> "Medium";
            case 12 -> "Large";
            case 14 -> "Extra Large";
            default -> "Unknown size";
        };
        System.out.println(result);

        String result2 = switch (size) {
            case 8:
                yield "Small";
            case 10:
                yield "Medium";
            case 12:
                yield "Large";
            case 14:
                yield "Extra Large";
            default:
                yield "Unknown size";
        };
        System.out.println(result2);

        scanner.close();
    }
}
