package com.movie.services;

import com.movie.entity.Screen;
import com.movie.entity.Show;
import com.movie.entity.Theatre;
import com.movie.exceptions.InvalidShowException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ShowService {
    private final Map<String, Show> shows;

    public ShowService() {
        this.shows = new HashMap<String, Show>();
    }

    public Show createShow(String movieName, Integer durationInMins, Integer startTime, Theatre theatre, Screen screen){
        String showId = UUID.randomUUID().toString();
        if(ifShowCreationInvalid()){
            throw new InvalidShowException();
        }

        Show show = new Show(showId, movieName, durationInMins, startTime, theatre, screen);
        shows.put(showId, show);
        return show;
    }

    private Boolean ifShowCreationInvalid(){
        // logic to find out show is valid or not
        return false;
    }
}
