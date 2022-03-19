package com.movie.entity;

import java.time.Instant;

public class SeatLock {
    private final Seat seat;
    private final Integer creationTime;
    private final Integer timeOutExpiration;

    public SeatLock(Seat seat, Integer creationTime, Integer timeOutExpiration) {
        this.seat = seat;
        this.creationTime = creationTime;
        this.timeOutExpiration = timeOutExpiration;
    }


}
