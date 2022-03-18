package com.movie.entity;

public class Show {
    private final String showId;
    private final String movieName;
    private Integer durationInMins;
    private Integer startTime;
    private Theatre theatre;
    private Screen screen;

    public Show(String showId, String movieName, Integer durationInMins, Integer startTime, Theatre theatre, Screen screen) {
        this.showId = showId;
        this.movieName = movieName;
        this.durationInMins = durationInMins;
        this.startTime = startTime;
        this.theatre = theatre;
        this.screen = screen;
    }

    public String getShowId() {
        return showId;
    }

    public String getMovieName() {
        return movieName;
    }

    public Integer getDurationInMins() {
        return durationInMins;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public Screen getScreen() {
        return screen;
    }
}
