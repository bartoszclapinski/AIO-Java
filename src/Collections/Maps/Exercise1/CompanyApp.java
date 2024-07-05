package Collections.Maps.Exercise1;

import java.util.Scanner;

public class CompanyApp {
    private static Scanner scanner = new Scanner(System.in);

    private static void addEmployee(Company company, Employee employee) {
        company.addEmployee(employee);
    }

    private static void showEmployee(Company company, String key) {
        company.printEmployee(key);
    }

    private static int showOptions() {
        System.out.print("Choose an option: \n(1) Add employee\n(2) Show employee\n(3) Exit\n");
        return Integer.parseInt(scanner.nextLine());
    }

    public static Employee createEmployee(){
        System.out.println("Enter employee's first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter employee's last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter employee's salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        return new Employee(firstName, lastName, salary);
    }

    public static void main(String[] args) {
        Company company = new Company();
        int option;

        do {
            option = showOptions();
            switch (option) {
                case 1:
                    addEmployee(company, createEmployee());
                    break;
                case 2:
                    System.out.println("Enter employee's first name and last name: ");
                    showEmployee(company, scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (option != 3);
    }
}
