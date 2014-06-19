package com.epam.ad.hotel.entity;

import java.math.BigDecimal;

public abstract class Room implements Comparable<Room>{ //арендуемое помещение

    BigDecimal price;   //стоимость за час

    public abstract BigDecimal getCurrentCost();

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
