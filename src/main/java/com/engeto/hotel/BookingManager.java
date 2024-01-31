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
    public void limitReservations(int limit) {
        int reservation = 0;
        for (Booking booking : listOfReservations) {
            if (reservation < limit && booking.getTypeOfVacation().equals(TypeOfVacation.REKREACNI)) {
                System.out.println("Rekreační Od " +booking.getBeginDate()+ "do "+booking.getEndDate()+" jméno hlavního hosta " +booking.getFirstGuest().getFirstName()+" " +booking.getFirstGuest().getSecondName()+" " +booking.getFirstGuest().getBirth()+" [ "+booking.getNumberOfGuest()+" "+booking.getRoom().getBalconey()+"] za cenu: " +booking.getRoom().getPrice()+ "Kč");
                reservation += 1;
            }
        }
    }
    public Booking getBooking(int index) {
        return listOfReservations.get(index);
    }
    public void clearBookings() {
        listOfReservations.clear();
    }
    public int getNumberOfWorkingBookings() {
        int totalWorkingBookings = 0;
        for(Booking booking : listOfReservations) {
            if (booking.getTypeOfVacation().equals(TypeOfVacation.PRACOVNI)) {
                totalWorkingBookings += 1;
            }
        }
        return totalWorkingBookings;
    }
    public double getAverageGuests() {
        double totalGuests = 0;
        double numberOfBookings = 0;
        for(Booking booking : listOfReservations) {
            totalGuests += booking.getNumberOfGuest();
            numberOfBookings += 1;
        }
        return totalGuests/numberOfBookings;
    }
}

