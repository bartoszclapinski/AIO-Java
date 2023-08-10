package Polymorphism.Exercise1;

public class Person {
    private String Name;
    private String Surname;
    private double Salary;

    public Person(String Name, String Surname, double Salary) {
        this.Name = Name;
        this.Surname = Surname;
        this.Salary = Salary;
    }

    public void printInfo() {
        System.out.println("Name: " + Name + ", Surname: " + Surname + ", Salary: " + Salary);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
