package Collections.Queues;

public class Client implements Comparable<Client> {
    private String name;
    private int ordersNumber;

    public Client(String name, int ordersNumber) {
        this.name = name;
        this.ordersNumber = ordersNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrdersNumber() {
        return ordersNumber;
    }

    public void setOrdersNumber(int ordersNumber) {
        this.ordersNumber = ordersNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", ordersNumber=" + ordersNumber +
                '}';
    }

    @Override
    public int compareTo(Client c) {
        // Return in descending order
        return -Integer.compare(ordersNumber, c.ordersNumber);
    }
}

