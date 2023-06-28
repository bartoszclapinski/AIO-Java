package Encapsulation.Exercise2;

public class CinemaSystem {
    public static void main(String[] args) {
        MovieShow movie1 = new MovieShow("Omen", "horror", 128, 16, 72, 72);
        Client client1 = new Client("Jan", "Kowalski", 15);
        TicketSystem ticketSystem = new TicketSystem();
        Ticket ticket1 = ticketSystem.createTicket(movie1, client1);

        Client client2 = new Client("Anna", "Zalewska", 19);
        Ticket ticket2 = ticketSystem.createTicket(movie1, client2);

        System.out.println("Tickets sold: ");
        if (ticket1 != null) {
            System.out.println(ticket1.getInfo());
        }
        if (ticket2 != null) {
            System.out.println(ticket2.getInfo());
        }

        System.out.println("Free seats: " + movie1.getFreeSeats());
        System.out.println("Tickets sold: " + (movie1.getMaxSeats() - movie1.getFreeSeats()));
    }
}
