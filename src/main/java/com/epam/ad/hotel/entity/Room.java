package com.epam.ad.hotel.entity;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Room { //арендуемое помещение

    private Date timeOfEntry; // время заезда
    private int hoursCount;  //количество часов
    BigDecimal initialCost;   //стоимость за час

    public abstract BigDecimal GetCurrentCost();



    public Date getTimeOfEntry() {
        return timeOfEntry;
    }

    public int getHoursCount() {
        return hoursCount;
    }

    public BigDecimal getInitialCost() {
        return initialCost;
    }



    public void setTimeOfEntry(Date timeOfEntry) {
        this.timeOfEntry = timeOfEntry;
    }

    public void setHoursCount(int hoursCount) {
        this.hoursCount = hoursCount;
    }

    public void setInitialCost(BigDecimal initialCost) {
        this.initialCost = initialCost;
    }
}
