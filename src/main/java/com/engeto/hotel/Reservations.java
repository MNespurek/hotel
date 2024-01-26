package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class Reservations {
    List<Booking> listOfReservations = new ArrayList<>();

    public void addBooking(Booking booking) {
        listOfReservations.add(booking);
    }

    public void writeReservations() {
        for (Booking booking : listOfReservations) {

            System.out.println("Rezervace je na pokoj" + booking.room.getNumber() + ".");
            System.out.println("Rezervace v termínu od: " + booking.beginDate + " do " + booking.endDate + ".");
        }
    }
}
