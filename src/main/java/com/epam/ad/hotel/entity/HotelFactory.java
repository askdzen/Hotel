package com.epam.ad.hotel.entity;

public class HotelFactory {
public static Hotel createRandomHotel(){
    Hotel hotel=new Hotel("California","USA");

    for (int i=0;i<100;i++ ) {
Room room = RoomFactory.createRandomTenement();
        hotel.add(room);
    }
    return hotel;
    }
}
