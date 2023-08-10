package Polymorphism.Exercise1;

public class Nurse extends Person{
    private double overtime;

    public Nurse(String Name, String Surname, double Salary, double overtime) {
        super(Name, Surname, Salary);
        this.overtime = overtime;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + getName() + ", Surname: " + getSurname()
                + ", Salary: " + getSalary() + ", Overtime: " + overtime);
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
}
