package Loops.Exercise2;

public class HospitalApp {
    public static void main(String[] args) {
        int choice = -1;

        while (choice != 0) {
            Hospital.printOptions();
            choice = Hospital.getChoice();
            Hospital.executeChoice(choice);
        }

        System.out.println("Bye bye!");
        Hospital.closeScanner();
    }
}
