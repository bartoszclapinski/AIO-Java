package Loops.Exercise2;

import java.util.Scanner;

public class Hospital {
    private static final int MAX_PATIENTS = 10;
    private int patientsNumber;
    private final Patient[] patients;
    private static Scanner scanner;

    public Hospital() {
        patients = new Patient[MAX_PATIENTS];
        patientsNumber = 0;
        scanner = new Scanner(System.in);
    }

    public static void printOptions() {
        System.out.println("1. Add patient");
        System.out.println("2. Show patients");
        System.out.println("0. Exit");
    }

    public static int getChoice() {
        System.out.println("Choose option: ");
        return scanner.nextInt();
    }

    public static void executeChoice(int choice) {
        Hospital hospital = new Hospital();
        switch (choice) {
            case 1:
                hospital.addPatient(hospital.createPatient());
                break;
            case 2:
                hospital.showPatients();
                break;
            case 0:
                System.out.println("Bye!");
                break;
            default:
                System.out.println("Wrong choice!");
                break;
        }
    }

    public static void closeScanner() {
        scanner.close();
    }

    private Patient createPatient() {
        System.out.println("Insert first name: ");
        String firstName = scanner.next();
        System.out.println("Insert last name: ");
        String lastName = scanner.next();
        System.out.println("Insert PESEL: ");
        String pesel = scanner.next();
        return new Patient(firstName, lastName, pesel);
    }

    private void showPatients() {
        for (Patient patient : patients) {
            if (patient != null) {
                System.out.println(patient.getFirstName() + " " + patient.getLastName() + " " + patient.getPesel());
            }
        }
    }

    private void addPatient(Patient patient) {
        if (patientsNumber < MAX_PATIENTS) {
            patients[patientsNumber] = patient;
            patientsNumber++;
            System.out.println("Patient added.");
        } else {
            System.out.println("Hospital is full.");
        }
    }
}
