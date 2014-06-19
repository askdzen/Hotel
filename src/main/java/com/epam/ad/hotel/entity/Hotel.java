package com.epam.ad.hotel.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Hotel extends Room implements Comparable<Room>{
    private String name;
    private String address;
    private int roomCount;
    public List<Room> rooms = new ArrayList<Room>();

    public Hotel(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public void add(Room room) {
        rooms.add(room);
        roomCount++;

    }

    public BigDecimal getTotalRoomsCost() {
        BigDecimal totalCost = BigDecimal.ZERO;
        for (Room room : rooms) {
            totalCost = totalCost.add(room.getCurrentCost());
        }
        return totalCost;
    }

    public void show() {
        System.out.println(rooms);
    }

    @Override
    public String toString() {

        return "Hotel{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", roomCount=" + roomCount +
                ", rooms:" + "\n" + rooms.subList(0, 50) +
                '}';


    }


    @Override
    public int compareTo(Room anotherRoom) {
return super.price.compareTo(anotherRoom.price);
        //return this.rooms.indexOf(compareTo(anotherRoom));
    }

    @Override
    public BigDecimal getCurrentCost() {
        return null;
    }
}
