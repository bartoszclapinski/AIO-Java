package Enum.Exercise2;

import java.util.Scanner;

public class ShopManager {

    public static void main(String[] args) {
        Order[] orders = createOrders();
        OrderStatus orderStatus = readOrderStatus();
        Order[] filteredOrders = filteredOrders(orders, orderStatus);
        printOrders(filteredOrders, orderStatus);
    }

    private static void printOrders(Order[] filteredOrders, OrderStatus orderStatus) {
        System.out.println("Orders with status: " + orderStatus);
        for (Order order : filteredOrders) {
            System.out.println(order);
        }
    }

    private static Order[] createOrders(){
        Order[] orders = new Order[10];
        orders[0] = new Order("Apple MacBook Pro 13", 1999.99, OrderStatus.NEW);
        orders[1] = new Order("Apple MacBook Pro 16", 2999.99, OrderStatus.NEW);
        orders[2] = new Order("Apple MacBook Air", 1299.99, OrderStatus.PAID);
        orders[3] = new Order("Apple iPad", 999.99, OrderStatus.PAID);
        orders[4] = new Order("Apple iPhone", 1499.99, OrderStatus.SHIPPED);
        orders[5] = new Order("Samsung Galaxy", 899.99, OrderStatus.SHIPPED);
        orders[6] = new Order("Samsung Galaxy Note", 1099.99, OrderStatus.DELIVERED);
        orders[7] = new Order("Samsung Galaxy Tab", 799.99, OrderStatus.DELIVERED);
        orders[8] = new Order("Samsung Galaxy Watch", 599.99, OrderStatus.CANCELLED);
        orders[9] = new Order("Samsung Galaxy Buds", 499.99, OrderStatus.CANCELLED);
        return orders;
    }

    private static OrderStatus readOrderStatus(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose order status:");
        for (OrderStatus orderStatus : OrderStatus.values()) {
            System.out.println(orderStatus);
        }
        String status = scanner.nextLine().toUpperCase();
        scanner.close();
        return OrderStatus.valueOf(status);
    }

    private static Order[] filteredOrders(Order[] orders, OrderStatus orderStatus) {
        int size = countOrdersByStatus(orders, orderStatus);
        Order[] filteredOrders = new Order[size];
        int index = 0;
        for (Order order : orders) {
            if (order.getOrderStatus() == orderStatus) {
                filteredOrders[index] = order;
                index++;
            }
        }
        return filteredOrders;
    }

    private static int countOrdersByStatus(Order[] orders, OrderStatus orderStatus) {
        int count = 0;
        for (Order order : orders) {
            if (order.getOrderStatus() == orderStatus) {
                count++;
            }
        }
        return count;
    }
}
