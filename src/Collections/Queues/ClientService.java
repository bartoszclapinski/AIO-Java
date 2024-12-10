package Collections.Queues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ClientService {
    public static void main(String[] args) {
        
        Queue<Client> clients = new LinkedList<>();
        clients.add(new Client("John", 0));
        clients.add(new Client("Jane", 0));
        clients.add(new Client("Jim", 0));
        
        Client client1 = clients.peek();
        Client client2 = clients.peek();
        Client client3 = clients.peek();

        System.out.println("Clients after peek: " + clients);
        System.out.println("Client1: " + client1);
        System.out.println("Client2: " + client2);
        System.out.println("Client3: " + client3);

        Client client4 = clients.poll();
        Client client5 = clients.poll();
        Client client6 = clients.poll();

        System.out.println("Clients after poll: " + clients);
        System.out.println("Client4: " + client4);
        System.out.println("Client5: " + client5);
        System.out.println("Client6: " + client6);

        Queue<Client> clients2 = new ArrayBlockingQueue<>(3);
        clients2.add(new Client("John", 0));
        clients2.add(new Client("Jane", 0));
        clients2.add(new Client("Jim", 0));

        System.out.println("Clients2: " + clients2);

        clients2.offer(new Client("Mike", 0));
        System.out.println("Clients2 after offer: " + clients2);
        clients2.remove();
        System.out.println("Clients2 after remove: " + clients2);
        clients2.element();
        System.out.println("Clients2 after element: " + clients2);

        Queue<Client> clients3 = new PriorityQueue<>((c1, c2) -> 
            Integer.compare(c1.getOrdersNumber(), c2.getOrdersNumber()));

        clients3.add(new Client("John", 2));
        clients3.add(new Client("Jane", 5));
        clients3.add(new Client("Jim", 4));
        clients3.add(new Client("Mike", 3));

        System.out.println("Clients3: " + clients3);
        while (!clients3.isEmpty()) {
            System.out.println("Client to serve: " + clients3.poll());
        }
        System.out.println("Clients3 after poll: " + clients3);

    }
    
}
