package com.epam.ad.hotel.entity;

import java.math.BigDecimal;

public abstract class Room { //арендуемое помещение

  BigDecimal price;   //стоимость за час

    public abstract BigDecimal GetCurrentCost();





    public BigDecimal getPrice() {
        return price;
    }





    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
