package com.epam.ad.hotel.entity;

import java.math.BigDecimal;

public class ConferenceRoom extends Room {
    private int square;
    private int seatsNumber;

    public ConferenceRoom(ConferenceRoomBuilder builder) {
        square = builder.square;
        seatsNumber = builder.seatsNumber;
        price = builder.price;

    }

    @Override
    public BigDecimal getCurrentCost() {
        return BigDecimal.ZERO;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getNumberOfSeats() {
        return seatsNumber;
    }

    public void setNumberOfSeats(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    @Override
    public String toString() {
        return "ConferenceRoom{" +
                "square=" + square +
                ", seatsNumber=" + seatsNumber +
                '}' + "\n";
    }

    public static class ConferenceRoomBuilder {
        private int square = 0;
        private int seatsNumber = 0;
        private BigDecimal price = BigDecimal.ZERO;

        public ConferenceRoomBuilder size(int val) {
            square = val;
            return this;
        }

        public ConferenceRoomBuilder numberOfSeats(int val) {
            seatsNumber = val;
            return this;
        }

        public ConferenceRoomBuilder initialCost(BigDecimal val) {
            price = val;
            return this;
        }

        public ConferenceRoom build() {
            return new ConferenceRoom(this);
        }
    }

}
