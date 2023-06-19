package Agregation.Exercise1;

public class Bank {
    public static void main(String[] args) {
        //  Create two addresses
        Address address1 = new Address();
        address1.street = "Street1";
        address1.houseNumber = "1";
        address1.flatNumber = "1";
        address1.city = "City1";
        address1.country = "Country1";
        address1.postalCode = "PostalCode1";

        Address address2 = new Address();
        address2.street = "Street2";
        address2.houseNumber = "2";
        address2.flatNumber = "2";
        address2.city = "City2";
        address2.country = "Country2";
        address2.postalCode = "PostalCode2";

        //  Create two persons
        Person person1 = new Person();
        person1.firstName = "John";
        person1.lastName = "Smith";
        person1.pesel = "12345678901";
        person1.houseAddress = address1;
        person1.correspondenceAddress = address1;

        Person person2 = new Person();
        person2.firstName = "Jane";
        person2.lastName = "Doe";
        person2.pesel = "12345678902";
        person2.houseAddress = address2;
        person2.correspondenceAddress = address1;

        //  Create two bank accounts and two credits
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.owner = person1;
        bankAccount1.balance = 10000.0;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.creditAmount = 5000.0;
        credit1.creditAmountReturned = 0.0;
        credit1.creditInterestRate = 0.05;
        credit1.creditPeriod = 12;

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.owner = person2;
        bankAccount2.balance = 20000.0;

        Credit credit2 = new Credit();
        credit2.borrower = person2;
        credit2.creditAmount = 10000.0;
        credit2.creditAmountReturned = 0.0;
        credit2.creditInterestRate = 0.1;
        credit2.creditPeriod = 24;

        //  Print out the results
        System.out.println("Owner: ");
        System.out.println
                (bankAccount1.owner.firstName + " " + bankAccount1.owner.lastName + " " + bankAccount1.owner.pesel);
        System.out.println("Lives at: " + bankAccount1.owner.houseAddress.city);
        System.out.println("Balance: " + bankAccount1.balance);
        System.out.println("Credit: " + credit1.creditAmount);

        System.out.println("Owner: ");
        System.out.println
                (bankAccount2.owner.firstName + " " + bankAccount2.owner.lastName + " " + bankAccount2.owner.pesel);
        System.out.println("Lives at: " + bankAccount2.owner.houseAddress.city);
        System.out.println("Balance: " + bankAccount2.balance);
        System.out.println("Credit: " + credit2.creditAmount);
    }
}
