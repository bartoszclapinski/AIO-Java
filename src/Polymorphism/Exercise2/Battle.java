package Polymorphism.Exercise2;

public class Battle {
    public static void main(String[] args) {
        Team team1 = new Team();
        team1.addPlayer(new Attacker("John", 50, 10, 30, 0.5));
        team1.addPlayer(new Defender("Ann", 35, 20, 30, 0.5));
        team1.addPlayer(new Attacker("Peter", 60, 10, 40, 0.5));
        team1.printTeamInfo();

        Team team2 = new Team();
        team2.addPlayer(new Attacker("John", 40, 15, 50, 0.5));
        team2.addPlayer(new Defender("Ann", 30, 50, 50, 0.5));
        team2.addPlayer(new Attacker("Peter", 40, 10, 50, 0.5));
        team2.printTeamInfo();

        System.out.println("Battle result: " + fight(team1, team2));
    }

    private static String fight(Team team1, Team team2) {
        while (team1.getTeamEnergy() > 0 && team2.getTeamEnergy() > 0) {
            double team1Attack = team1.getTeamAttack() - team2.getTeamDefense();
            double team2Attack = team2.getTeamAttack() - team1.getTeamDefense();

            if (team1Attack > 0) {
                team2.setTeamEnergy(team2.getTeamEnergy() - team1Attack);
            }

            if (team2Attack > 0) {
                team1.setTeamEnergy(team1.getTeamEnergy() - team2Attack);
            }
        }

        if (team1.getTeamEnergy() > 0) {
            return "Team 1 won!";
        } else {
            return "Team 2 won!";
        }
    }
}
