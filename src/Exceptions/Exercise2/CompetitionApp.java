package Exceptions.Exercise2;

public class CompetitionApp {
    public static void main(String[] args) {
        CompetitionController competitionController = new CompetitionController();
        competitionController.run();
        competitionController.close();
    }
}
