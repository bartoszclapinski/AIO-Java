package Exceptions.Exercise2;

import Exceptions.Custom.InvalidAgeException;
import Exceptions.Custom.NoMoreSpaceException;

import java.util.Scanner;

public class CompetitionController {

    private Scanner _scanner = new Scanner(System.in);

    void run() {
        Competition competition = createCompetition();
    }

    private Competition createCompetition() {
        System.out.println("Enter competition name: ");
        String name = _scanner.nextLine();
        System.out.println("Enter max participants: ");
        int maxParticipants = _scanner.nextInt();
        System.out.println("Enter age limit: ");
        int ageLimit = _scanner.nextInt();
        _scanner.nextLine();
        return new Competition(name, ageLimit, maxParticipants);
    }

    private void fillParticipantsInfo(Competition competition) {
        while (competition.hasFreeSpots()) {
            System.out.println("Add new participant.");
            Participant participant = createParticipant();
            try {
                competition.addParticipant(participant);
            } catch (NoMoreSpaceException | InvalidAgeException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private Participant createParticipant() {
        System.out.println("Enter first name: ");
        String firstName = _scanner.nextLine();
        System.out.println("Enter last name: ");
        String lastName = _scanner.nextLine();
        System.out.println("Enter document id: ");
        String documentId = _scanner.nextLine();
        System.out.println("Enter age: ");
        int age = _scanner.nextInt();
        _scanner.nextLine();
        return new Participant(firstName, lastName, documentId, age);
    }

    private void printCompetitionInfo(Competition competition) {
        System.out.println(competition);
    }

    public void close() {
        _scanner.close();
    }
}
