package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private Integer number;
    private Integer beds;
    private Boolean isBalconey;
    private Boolean seaView;
    private Integer price;



    public Room(Integer number, Integer beds, Boolean isBalconey, Boolean seaView, Integer price) {
        this.number = number;
        this.beds = beds;
        this.isBalconey = isBalconey;
        this.seaView = seaView;
        this.price = price;
    }
    public Room(Integer number, Integer beds, Integer price) {
        this(number, beds, false, false, price);
    }



    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Boolean getBalconey() {
        return isBalconey;
    }

    public void setBalconey(Boolean balconey) {
        isBalconey = balconey;
    }

    public Boolean getSeaView() {
        return seaView;
    }

    public void setSeaView(Boolean seaView) {
        this.seaView = seaView;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    }

