package com.movie.services;

import com.movie.entity.Screen;
import com.movie.entity.Seat;
import com.movie.entity.Theatre;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TheatreService {
    private Map<String, Theatre> theatres;
    private Map<String, Screen> screens;
    private Map<String, Seat> seats;

    public TheatreService() {
        this.theatres = new HashMap<String, Theatre>();
        this.screens = new HashMap<String, Screen>();
        this.seats = new HashMap<String, Seat>();

    }

    public Theatre createTheatre(String name){
        String theatreId = UUID.randomUUID().toString();

        Theatre theatre = new Theatre(theatreId, name);
        theatres.put(theatreId, theatre);
        return theatre;
    }

    public Screen createScreenInTheatre(String theatreId, String screenName){
        Theatre theatre = theatres.get(theatreId);
        Screen screen = createScreen(screenName);
        theatre.addScreen(screen);
        return  screen;
    }

    public Screen createScreen(String screenName){
        String id = UUID.randomUUID().toString();
        Screen screen = new Screen(id, screenName);
        screens.put(id, screen);
        return screen;
    }

    public Seat createSeatInScreen(String screenId, Integer rowNo, Integer seatNo){
        Screen screen = screens.get(screenId);
        Seat seat = createSeat(rowNo, seatNo);
        screen.addSeat(seat);
        return seat;
    }

    public Seat createSeat(Integer rowNo, Integer seatNo){
        String seatId = UUID.randomUUID().toString();
        Seat seat = new Seat(seatId, rowNo, seatNo);
        seats.put(seatId, seat);
        return  seat;
    }
}
