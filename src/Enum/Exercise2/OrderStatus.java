package Enum.Exercise2;

public enum OrderStatus {
    NEW("New"),
    PAID("Paid"),
    SHIPPED("Shipped"),
    DELIVERED("Delivered"),
    CANCELLED("Cancelled");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static OrderStatus fromDescription(String description) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.getDescription().equals(description)) {
                return orderStatus;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "description='" + description + '\'' +
                "} " + super.toString();
    }
}
