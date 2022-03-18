package com.movie.entity;

public class Seat {
    private final String seatID;
    Integer rowNo;
    Integer seatNo;

    public Seat(String seatID, Integer rowNo, Integer seatNo) {
        this.seatID = seatID;
        this.rowNo = rowNo;
        this.seatNo = seatNo;
    }

    public String getSeatID() {
        return seatID;
    }

    public Integer getRowNo() {
        return rowNo;
    }

    public Integer getSeatNo() {
        return seatNo;
    }
}
