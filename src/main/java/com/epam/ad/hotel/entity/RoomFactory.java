package com.epam.ad.hotel.entity;

import java.math.BigDecimal;
import java.util.Random;

public class RoomFactory {
    public static Room createRandomTenement(){
        Room room =null;
        int x = new Random().nextInt(3);
        switch (x){
            case 1:ResidentRoom residentRoom = new ResidentRoom("трехместный",true,true, BigDecimal.valueOf(1000));
                room = residentRoom;
                break;
            case 2:ResidentRoom residentRoom1 = new ResidentRoom("двухместный",true,false,BigDecimal.valueOf(1000));
                room = residentRoom1;
                break;
            case 3:ResidentRoom residentRoom2 = new ResidentRoom("одноместный", false,false,BigDecimal.valueOf(1000));
                room = residentRoom2;
                break;
         /*   case 4:ConferenceRoom conferenceroom = new ConferenceRoom(50,15);
                room=conferenceroom;
                break;
            case 5:ConferenceRoom conferenceroom1 = new ConferenceRoom(100,30);
                room=conferenceroom1;
                break;
*/


        }
        return room;
    }
}
