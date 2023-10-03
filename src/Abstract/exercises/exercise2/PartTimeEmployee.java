package Abstract.exercises.exercise2;

import java.util.Objects;

public class PartTimeEmployee extends Employee {

    private int hours;
    private double hourlyRate;

    public PartTimeEmployee(String firstName, String lastName, int hours, double hourlyRate) {
        super(firstName, lastName);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    double getMonthlySalary() {
        return hours * hourlyRate;
    }

    @Override
    double getYearlySalary() {
        return getMonthlySalary() * 12;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "hours=" + hours +
                ", hourlyRate=" + hourlyRate +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PartTimeEmployee that = (PartTimeEmployee) o;
        return getHours() == that.getHours() && Double.compare(getHourlyRate(), that.getHourlyRate()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHours(), getHourlyRate());
    }
}
