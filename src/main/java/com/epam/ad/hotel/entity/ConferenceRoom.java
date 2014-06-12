package com.epam.ad.hotel.entity;

import java.math.BigDecimal;

public class ConferenceRoom extends Room {
    private int size; // размер в кв.м
    private int numberOfSeats;

    public ConferenceRoom(int size, int numberOfSeats) {

        this.size = size;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public BigDecimal GetCurrentCost() {
        return BigDecimal.ZERO;
    }

    public int getSize() {
        return size;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
