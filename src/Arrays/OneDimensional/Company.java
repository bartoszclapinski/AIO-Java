package Arrays.OneDimensional;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Emloyee[] employees = new Emloyee[20];

        employees[0] = new Emloyee("John", "Smith", 3500);
        employees[1] = new Emloyee("Ivone", "Novak", 4700);
        employees[2] = new Emloyee("Jessie", "Linkman", 3200);

        System.out.println("Array length: " + employees.length);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee index: ");
        int employeeIndex = scanner.nextInt();

        if (employeeIndex >= 0 && employeeIndex < employees.length && employees[employeeIndex] != null) {
            System.out.println(employees[employeeIndex].getFirstName() + " " +
                    employees[employeeIndex].getLastName() + ": " +
                    employees[employeeIndex].getSalary());
        } else {
            System.out.println("Employee with index " + employeeIndex + " does not exist");
        }

        scanner.close();
    }
}
