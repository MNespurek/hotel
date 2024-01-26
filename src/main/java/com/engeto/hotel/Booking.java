package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Booking {

    List<Booking> bookingList = new ArrayList<>();
    Room room;
    LocalDate beginDate;
    LocalDate endDate;
    TypeOfVacation typeOfVacation;

    Booking(Room room, LocalDate beginDate, LocalDate endDate, TypeOfVacation typeOfVacation) {
        this.room = room;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.typeOfVacation = typeOfVacation;
    }
}

