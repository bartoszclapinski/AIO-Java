package Exceptions.Exercise2;

import Exceptions.Custom.InvalidAgeException;
import Exceptions.Custom.NoMoreSpaceException;

public class Competition {
    private String name;
    private Participant[] participants;
    private int ageLimit;
    private int size;

    public Competition(String name, int ageLimit, int maxParticipants) {
        this.name = name;
        this.ageLimit = ageLimit;
        this.participants = new Participant[maxParticipants];
    }

    public void addParticipant(Participant participant) throws NoMoreSpaceException, InvalidAgeException {
        if (size == participants.length) {
            throw new NoMoreSpaceException("No more space");
        }
        if (participant.getAge() < ageLimit) {
            throw new InvalidAgeException("Invalid age");
        }
        participants[size++] = participant;
    }

    boolean hasFreeSpots() {
        return size < participants.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Competition: ").append(name).append("\n");
        sb.append("Participants: ").append(size).append("/").append(participants.length).append("\n");
        for (int i = 0; i < size; i++) {
            sb.append(participants[i]).append("\n");
        }
        return sb.toString();
    }
}
