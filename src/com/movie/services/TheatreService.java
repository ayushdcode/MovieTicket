package com.movie.services;

import com.movie.entity.Screen;
import com.movie.entity.Theatre;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TheatreService {
    private Map<String, Theatre> theatres;

    public TheatreService() {
        this.theatres = new HashMap<String, Theatre>();
    }

    public Theatre addTheatre(String name){
        String theatreId = UUID.randomUUID().toString();

        Theatre theatre = new Theatre(theatreId, name);
        theatres.put(theatreId, theatre);
        return theatre;
    }

    public void addScreenInTheatre(String theatreId, Screen screen){
        theatres.get(theatreId).addScreen(screen);
    }
}
