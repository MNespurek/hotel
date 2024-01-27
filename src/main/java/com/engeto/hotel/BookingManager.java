package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    List<Booking> listOfReservations = new ArrayList<>();

    public void addBooking(Booking booking) {
        listOfReservations.add(booking);
    }

    public void writeReservations() {
        for (Booking booking : listOfReservations) {

            System.out.println("Rezervace je na pokoj" + booking.getRoom().getNumber() + ".");
            System.out.println("Rezervace v termínu od: " + booking.getBeginDate() + " do " + booking.getEndDate() + ".");
        }

    }
}
