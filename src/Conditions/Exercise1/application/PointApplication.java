package Conditions.Exercise1.application;

import Conditions.Exercise1.model.Point;
import Conditions.Exercise1.controller.PointController;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PointApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point coordinates: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        Conditions.Exercise1.model.Point point = new Point(x, y);
        PointController pointController = new PointController();
        System.out.println("Choose option:");
        System.out.println("0 - exit");
        System.out.println("1 - show point coordinates");
        System.out.println("2 - add 1 to x");
        System.out.println("3 - add 1 to y");
        System.out.println("4 - subtract 1 from x");
        System.out.println("5 - subtract 1 from y");

        int option = scanner.nextInt();
        switch (option) {
            case 0 -> System.out.println("Bye, bye");
            case 1 -> System.out.println(point);
            case 2 -> pointController.addX(point);
            case 3 -> pointController.addY(point);
            case 4 -> pointController.minusX(point);
            case 5 -> pointController.minusY(point);
        }
    }
}
