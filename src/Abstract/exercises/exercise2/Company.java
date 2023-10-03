package Abstract.exercises.exercise2;

public class Company {
    public static void main(String[] args) {
        var employees = createEmployees();
        printEmployees(employees);

        System.out.println("Total salary: " + calculateTotalSalary(employees));
        System.out.println("Total yearly salary: " + calculateTotalYearlySalary(employees));
    }

    private static double calculateTotalYearlySalary(Employee[] employees) {
        var totalYearlySalary = 0.0;
        for (var employee : employees) {
            totalYearlySalary += employee.getYearlySalary();
        }
        return totalYearlySalary;
    }

    private static double calculateTotalSalary(Employee[] employees) {
        var totalSalary = 0.0;
        for (var employee : employees) {
            totalSalary += employee.getMonthlySalary();
        }
        return totalSalary;
    }

    private static Employee[] createEmployees() {
        var employees = new Employee[5];
        employees[0] = new FullTimeEmployee("John", "Smith", 15000);
        employees[1] = new FullTimeEmployee("Jane", "Smith", 17000);
        employees[2] = new PartTimeEmployee("John", "Doe", 40, 20);
        employees[3] = new PartTimeEmployee("Jane", "Doe", 30, 20);
        employees[4] = new PartTimeEmployee("Sue", "Nice", 40, 20);
        return employees;
    }

    private static void printEmployees(Employee[] employees) {
        for (var employee : employees) {
            System.out.println(employee);
        }
    }
}
