package Encapsulation.Exercise2;

public class MovieShow {
    private String movieTitle;
    private String movieType;
    private int movieDuration;
    private int ageRequired;
    private int maxSeats;
    private int freeSeats;

    public MovieShow(String movieTitle, String movieType, int movieDuration, int movieAgeRestriction, int maxSeats, int freeSeats) {
        this.movieTitle = movieTitle;
        this.movieType = movieType;
        this.movieDuration = movieDuration;
        this.ageRequired = movieAgeRestriction;
        this.maxSeats = maxSeats;
        this.freeSeats = freeSeats;
    }

    public boolean hasFreeSeats() {
        return freeSeats > 0;
    }

    public void decreaseFreeSeatsNumber() {
        freeSeats--;
    }

    public String getMovieInfo() {
        return "Title: " + movieTitle + "\nType: " + movieType + "\nDuration: " + movieDuration;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    public int getAgeRequired() {
        return ageRequired;
    }

    public void setAgeRequired(int ageRequired) {
        this.ageRequired = ageRequired;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }
}
