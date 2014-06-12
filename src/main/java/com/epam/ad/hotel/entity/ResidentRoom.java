package com.epam.ad.hotel.entity;

import java.math.BigDecimal;

public class ResidentRoom extends Room {
    private String type; //тип номера (одноместный, двух-трех:местный)
    private Boolean breakfast;
    private  Boolean wiFi;




    public ResidentRoom(String type, Boolean breakfast, Boolean wiFi, BigDecimal initialCost){
        this.type=type;
        this.breakfast=breakfast;
        this.wiFi=wiFi;
        this.initialCost=initialCost;
    }

    @Override
    public BigDecimal GetCurrentCost() {
        return initialCost;
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
