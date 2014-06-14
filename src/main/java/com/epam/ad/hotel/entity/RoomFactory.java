package com.epam.ad.hotel.entity;

import java.math.BigDecimal;
import java.util.Random;

public class RoomFactory {
    public static Room createRandomTenement(){
        Room room =null;
        int x = new Random().nextInt(5);
        switch (x){
            case 0:ResidentRoom residentRoom = new ResidentRoom.ResidentRoomBuilder().breakfast(false).type("одноместный").wiFi(false).initialCost(BigDecimal.valueOf(500)).build();
                room = residentRoom;
                break;
            case 1:ResidentRoom residentRoom1 = new ResidentRoom.ResidentRoomBuilder().type("трехместный").breakfast(true).wiFi(true).initialCost(BigDecimal.valueOf(1000)).build();
                room = residentRoom1;
                break;
            case 2:ResidentRoom residentRoom2 = new ResidentRoom.ResidentRoomBuilder().breakfast(true).wiFi(false).type("двухместный").initialCost(BigDecimal.valueOf(700)).build();
                room = residentRoom2;
                break;
           case 3:ConferenceRoom conferenceroom = new ConferenceRoom.ConferenceRoomBuilder().size(50).numberOfSeats(15).initialCost(BigDecimal.valueOf(2500)).build();
                room=conferenceroom;
                break;
            case 4:ConferenceRoom conferenceroom1 = new ConferenceRoom.ConferenceRoomBuilder().size(100).numberOfSeats(30).initialCost(BigDecimal.valueOf(5000)).build();
                room=conferenceroom1;
                break;


        }
        return room;


    }
}
