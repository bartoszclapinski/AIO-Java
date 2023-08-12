package Object.Exercise2;

import java.util.Objects;

public class BankAccount {
    private String accountNumber;
    private Client owner;
    private int yearCreated;

    public BankAccount(String accountNumber, Client owner, int yearCreated) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.yearCreated = yearCreated;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return getYearCreated() == that.getYearCreated() && Objects.equals(getAccountNumber(), that.getAccountNumber()) && Objects.equals(getOwner(), that.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountNumber(), getOwner(), getYearCreated());
    }
}
