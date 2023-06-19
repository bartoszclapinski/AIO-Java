package ClassesAndObjects.Exercise1;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "John";
        employee1.surname = "Doe";
        employee1.birthDate = "01.01.1990";

        Employee employee2 = new Employee();
        employee2.name = "Jane";
        employee2.surname = "Doe";
        employee2.birthDate = "01.01.1990";

        System.out.println("Employee 1:");
        System.out.println("Name: " + employee1.name);
        System.out.println("Surname: " + employee1.surname);
        System.out.println("Birth date: " + employee1.birthDate);

        System.out.println("\nEmployee 2:");
        System.out.println("Name: " + employee2.name);
        System.out.println("Surname: " + employee2.surname);
        System.out.println("Birth date: " + employee2.birthDate);
    }
}
