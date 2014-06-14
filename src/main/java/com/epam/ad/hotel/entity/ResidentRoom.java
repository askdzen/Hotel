package com.epam.ad.hotel.entity;

import java.math.BigDecimal;

enum roomType {SINGLEROOM, DOOBLEROOM, TRIPLEROOM};

public class ResidentRoom extends Room {

    private Boolean breakfast;
    private Boolean wiFi;
    private roomType roomType;

    public ResidentRoom(ResidentRoomBuilder builder) {
        price = builder.price;
        roomType = builder.roomType;
        breakfast = builder.breakfast;
        wiFi = builder.wiFi;
    }

    @Override
    public String toString() {
        return "ResidentRoom{" +
                "roomType='" + roomType + '\'' +
                ", breakfast=" + breakfast +
                ", wiFi=" + wiFi + "}" +
                "\n";
    }

    @Override
    public BigDecimal getCurrentCost() {
        return price;
    }

    public roomType getRoomType() {
        return roomType;
    }

    public void setRoomType(roomType roomType) {
        this.roomType = roomType;
    }

    public Boolean getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Boolean breakfast) {
        this.breakfast = breakfast;
    }

    public Boolean getWiFi() {
        return wiFi;
    }

    public void setWiFi(Boolean wiFi) {
        this.wiFi = wiFi;
    }

    public static class ResidentRoomBuilder {
        private BigDecimal price = BigDecimal.ZERO;
        private Boolean breakfast = false;
        private Boolean wiFi = false;
        private roomType roomType;

        public ResidentRoomBuilder roomType(roomType val) {
            roomType = val;
            return this;
        }

        public ResidentRoomBuilder initialCost(BigDecimal val) {
            price = val;
            return this;
        }

        public ResidentRoomBuilder breakfast(Boolean val) {
            breakfast = val;
            return this;
        }

        public ResidentRoomBuilder wiFi(Boolean val) {
            wiFi = val;
            return this;
        }

        public ResidentRoom build() {
            return new ResidentRoom(this);
        }
    }
}
