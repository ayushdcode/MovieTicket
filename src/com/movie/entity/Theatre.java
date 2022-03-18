package com.movie.entity;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String id;
    private final String theatreName;
    List<Screen> screens;

    public Theatre(String id, String theatreName) {
        this.id = id;
        this.theatreName = theatreName;
        screens = new ArrayList<Screen>();
    }

    public void addScreen(Screen screen){
        screens.add(screen);
        System.out.println("Screen added successfully");
    }

    public String getId() {
        return id;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public List<Screen> getScreens() {
        return screens;
    }
}
