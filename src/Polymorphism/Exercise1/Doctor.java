package Polymorphism.Exercise1;

public class Doctor extends Person{
    private String bonus;

    public Doctor(String Name, String Surname, double Salary, String bonus) {
        super(Name, Surname, Salary);
        this.bonus = bonus;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + getName() + ", Surname: " + getSurname()
                + ", Salary: " + getSalary() + ", Bonus: " + bonus);
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }
}
