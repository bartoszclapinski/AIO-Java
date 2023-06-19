package Agregation;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.owner = new Person();
        bankAccount1.owner.firstName = "Jon";
        bankAccount1.owner.lastName = "Snow";
        bankAccount1.owner.pesel = "12345678901";
        bankAccount1.balance = 10000.0;

        Credit credit1 = new Credit();
        credit1.borrower = bankAccount1.owner;
        credit1.creditAmount = 5000.0;
        credit1.creditAmountReturned = 0.0;
        credit1.creditInterestRate = 0.05;
        credit1.creditPeriod = 12;

        System.out.println("Owner: ");
        System.out.println
                (bankAccount1.owner.firstName + " " + bankAccount1.owner.lastName + " " + bankAccount1.owner.pesel);
        System.out.println("Balance: " + bankAccount1.balance);
        System.out.println("Credit: ");
        System.out.println("Amount: " + credit1.creditAmount);
        System.out.println("Returned: " + credit1.creditAmountReturned);
        System.out.println("Interest rate: " + credit1.creditInterestRate);
        System.out.println("Period: " + credit1.creditPeriod);

    }
}
