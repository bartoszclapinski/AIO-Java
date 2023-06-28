package Encapsulation.Exercise2;

public class TicketSystem {
    Ticket createTicket(MovieShow movieShow, Client client) {
        if (!movieShow.hasFreeSeats()) {
            System.out.println("Brak wolnych miejsc na wskazany seans");
            return null;
        } else if (!clientHasRequiredAgeForMovie(movieShow, client)) {
            System.out.println("Film dostępny dla osób powyżej " + movieShow.getAgeRequired() + " lat");
            return null;
        } else {
            int ticketId = generateNextTicketId(movieShow);
            movieShow.decreaseFreeSeatsNumber();
            return new Ticket(ticketId, movieShow, client);
        }
    }

    private int generateNextTicketId(MovieShow movie) {
        return movie.getMaxSeats() - movie.getFreeSeats() + 1;
    }

    private boolean clientHasRequiredAgeForMovie(MovieShow movie, Client client) {
        return client.getAge() >= movie.getAgeRequired();
    }
}
