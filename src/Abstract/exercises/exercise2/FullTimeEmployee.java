package Abstract.exercises.exercise2;

import java.util.Objects;

public class FullTimeEmployee extends Employee {

    private double monthlySalary;
    private double bonus = 0.02;

    public FullTimeEmployee(String firstName, String lastName, double monthlySalary) {
        super(firstName, lastName);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    double getYearlySalary() {
        var yearlySalary = monthlySalary * 12;
        return yearlySalary + (yearlySalary * bonus);
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", bonus=" + bonus +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FullTimeEmployee that = (FullTimeEmployee) o;
        return Double.compare(getMonthlySalary(), that.getMonthlySalary()) == 0 && Double.compare(getBonus(), that.getBonus()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMonthlySalary(), getBonus());
    }
}
