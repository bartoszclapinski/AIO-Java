package Encapsulation;

public class Client {
    private String firstName;
    private String lastName;
    private boolean isPremiumCustomer;

    public Client(String firstName, String lastName, boolean isPremiumCustomer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isPremiumCustomer = isPremiumCustomer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isPremiumCustomer() {
        return isPremiumCustomer;
    }

    public void setPremiumCustomer(boolean premiumCustomer) {
        isPremiumCustomer = premiumCustomer;
    }

    public void printInfo() {
        if (firstName == null && lastName == null) {
            System.out.println("Hello Anonymous");
        } else if (firstName == null || lastName == null) {
            if (firstName == null) {
                System.out.println("Hello Mr/Ms " + lastName);
            } else {
                System.out.println("Hello " + firstName);
            }
        } else {
            System.out.println("Hello " + firstName + " " + lastName);
        }
    }
}
