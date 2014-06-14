package com.epam.ad.hotel.entity;

import java.math.BigDecimal;

public class ConferenceRoom extends Room {
    private int square; // размер в кв.м
    private int seatsNumber;

    public static class ConferenceRoomBuilder{
        private int size=0;
        private int numberOfSeats=0;
        private BigDecimal price =BigDecimal.ZERO;

        public ConferenceRoomBuilder size(int val){
            size=val;return this;
        }
        public ConferenceRoomBuilder numberOfSeats(int val){
            numberOfSeats=val; return this;
        }
        public ConferenceRoomBuilder initialCost(BigDecimal val){
            price =val; return  this;
        }
        public ConferenceRoom build(){
            return new ConferenceRoom(this);
        }
    }
    public ConferenceRoom(ConferenceRoomBuilder builder) {
        square =builder.size;
        seatsNumber=builder.numberOfSeats;
        price =builder.price;

    }



    @Override
    public BigDecimal GetCurrentCost() {
        return BigDecimal.ZERO;
    }

    public int getSquare() {
        return square;
    }

    public int getNumberOfSeats() {
        return seatsNumber;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void setNumberOfSeats(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    @Override
    public String toString() {
        return "ConferenceRoom{" +
                "square=" + square +
                ", numberOfSeats=" + seatsNumber +
                '}'+"\n";
    }

}
