package com.movie.entity;

import java.util.List;
import java.util.zip.DataFormatException;

public class MovieTicket {
    private final String ticketId;
    private Show show;
    private List<Seat> bookedSeat;
    private Integer paymentAmount;
    private PaymentStatus paymentStatus;

    public MovieTicket(String ticketId, Show show, List<Seat> bookedSeat, Integer paymentAmount, PaymentStatus paymentStatus) {
        this.ticketId = ticketId;
        this.show = show;
        this.bookedSeat = bookedSeat;
        this.paymentAmount = paymentAmount;
        this.paymentStatus = paymentStatus;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Show getShow() {
        return show;
    }

    public List<Seat> getBookedSeat() {
        return bookedSeat;
    }

    public Integer getPaymentAmount() {
        return paymentAmount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }
}
