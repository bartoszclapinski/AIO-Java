package Files.Exercise1;

import java.io.Serializable;
import java.util.Arrays;

public class Company implements Serializable {
    public static final int MAX_EMPLOYEES = 3;
    private Employee[] employees = new Employee[MAX_EMPLOYEES];
    private int index = 0;

    public void addEmployee(Employee employee) {
        if (index < MAX_EMPLOYEES) {
            employees[index] = employee;
            index++;
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }
}
