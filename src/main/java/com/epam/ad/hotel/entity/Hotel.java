package com.epam.ad.hotel.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private  String address;
    private int roomCount;
    private List<Room> rooms =new ArrayList<Room>();

    public  Hotel(String name,String address){
        this.name=name;
        this.address=address;

    }
    public void add(Room room){
        rooms.add(room);

    }
    public BigDecimal getTotalRoomsCost(){
        BigDecimal totalcost=BigDecimal.ZERO;
        for (Room room : rooms) {
            totalcost=totalcost.add(room.GetCurrentCost());
        } return totalcost;
    }
    public void show(){
        System.out.println(rooms);
    }
}
