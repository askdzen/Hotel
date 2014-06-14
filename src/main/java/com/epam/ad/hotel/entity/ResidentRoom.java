package com.epam.ad.hotel.entity;

import java.math.BigDecimal;

public class ResidentRoom extends Room {
    private String type; //тип номера (одноместный, двух-трех:местный)
    private Boolean breakfast;
    private  Boolean wiFi;

    public static class ResidentRoomBuilder{
        private BigDecimal price =BigDecimal.ZERO;
        private String type="";
        private Boolean breakfast=false;
        private  Boolean wiFi=false;

    public ResidentRoomBuilder type(String val){
        type=val;return this;
    }
        public ResidentRoomBuilder initialCost(BigDecimal val){
            price =val;return this;
        }
        public ResidentRoomBuilder breakfast(Boolean val){
            breakfast=val;return this;
        }
        public ResidentRoomBuilder wiFi(Boolean val){
            wiFi=val;return this;
        }
        public ResidentRoom build(){return new ResidentRoom(this);}
    }


        public ResidentRoom(ResidentRoomBuilder builder){
            price =builder.price;
            type=builder.type;
            breakfast=builder.breakfast;
            wiFi=builder.wiFi;
        }

    @Override
    public String toString() {
        return "ResidentRoom{" +
                "type='" + type + '\'' +
                ", breakfast=" + breakfast +
                ", wiFi=" + wiFi +"}"+
                "\n";
    }

    @Override
    public BigDecimal GetCurrentCost() {
        return price;
    }
    public String getType() {
        return type;
    }

    public Boolean getBreakfast() {
        return breakfast;
    }

    public Boolean getWiFi() {
        return wiFi;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBreakfast(Boolean breakfast) {
        this.breakfast = breakfast;
    }

    public void setWiFi(Boolean wiFi) {
        this.wiFi = wiFi;
    }
}
