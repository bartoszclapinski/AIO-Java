package Polymorphism.Exercise2;

public class Team {
    private Player[] players;
    private final int TEAM_SIZE = 3;
    private double teamAttack;
    private double teamDefense;
    private double teamEnergy;

    public Team() {
        this.players = new Player[TEAM_SIZE];
        this.teamAttack = 0;
        this.teamDefense = 0;
        this.teamEnergy = 0;
    }

    public void addPlayer(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = player;

                teamAttack += player.getAttack();
                teamDefense += player.getDefense();
                teamEnergy += player.getEnergy();

                break;
            }
        }
    }

    public void printTeamInfo() {
        System.out.println("Attack: " + teamAttack + ", Defense: " + teamDefense + ", Energy: " + teamEnergy);
    }

    public void printPlayers() {
        for (Player player : players) {
            if (player != null) {
                player.printInfo();
            }
        }
    }

    public double getTeamAttack() {
        return teamAttack;
    }

    public double getTeamDefense() {
        return teamDefense;
    }

    public double getTeamEnergy() {
        return teamEnergy;
    }

    public void setTeamEnergy(double teamEnergy) {
        this.teamEnergy = teamEnergy;
    }
}
