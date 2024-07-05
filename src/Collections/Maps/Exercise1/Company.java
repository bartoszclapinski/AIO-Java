package Collections.Maps.Exercise1;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private Map<String, Employee> employees;

    public Company() {
        employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        String key = employee.getFirstName() + " " + employee.getLastName();
        employees.put(key, employee);
    }

    public void removeEmployee(String key) {
        employees.remove(key);
    }

    public void printEmployees() {
        employees.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

    public void printEmployee(String key){
        System.out.println(employees.get(key));
    }

}
