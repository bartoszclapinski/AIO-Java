package Files.Exercise1;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {

    private static final String fileName = "./src/Files/Exercise1/company.obj";
    private static final int READ_FROM_USER = 1;
    private static final int READ_FROM_FILE = 2;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Choose option: ");
        System.out.println("1 - read data from user");
        System.out.println("2 - read data from file");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case READ_FROM_USER -> {
                Company company = createCompany();
                writeToFile(company);
            }
            case READ_FROM_FILE -> {
                try {
                    Company companyFromFile = readFromFile();
                    System.out.println(companyFromFile);
                } catch (ClassNotFoundException | IOException e) {
                    System.err.println("Error while reading from file: " + fileName);
                    System.out.println(e.getMessage());
                }
            }
            default -> System.out.println("Wrong option");
        }

        scanner.close();
    }

    private static Company readFromFile() throws ClassNotFoundException, IOException {
        try (
                var fileInputStream = new FileInputStream(fileName);
                var objectInputStream = new ObjectInputStream(fileInputStream);
            ) {
            return (Company) objectInputStream.readObject();
        }
    }

    private static void writeToFile(Company company){
        try (
                var fileOutputStream = new FileOutputStream(fileName);
                var objectOutputStream = new ObjectOutputStream(fileOutputStream);
            ) {
            objectOutputStream.writeObject(company);
            System.out.println("Objects written to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error while writing to file: " + fileName);
            System.out.println(e.getMessage());
        }
    }

    private static Company createCompany() {
        Company company = new Company();
        for (int i = 0; i < Company.MAX_EMPLOYEES; i++) {
            System.out.println("Enter data for employee number " + (i + 1));
            company.addEmployee(createEmployee());
        }
        return company;
    }

    private static Employee createEmployee() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter surname: ");
        String surname = scanner.nextLine();
        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        return new Employee(name, surname, salary);
    }
}
