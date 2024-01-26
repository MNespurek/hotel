package com.engeto.hotel;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Guest guest = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest1 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 15));
        System.out.println("" + guest1.getFirstName() + " " + guest1.getSecondName() + " " + guest1.getBirth() + ".");
        System.out.println("" + guest.getFirstName() + " " + guest.getSecondName() + " " + guest.getBirth() + ".");

        Room room1 = new Room(1, 1, true, true, 1100);
        Room room2 = new Room(2, 1, true, true, 1100);
        Room room3 = new Room(3, 3, false, true, 2400);
        room1.addGuest(guest);
        room3.addGuest(guest);
        room3.addGuest(guest1);
        Booking booking1 = new Booking(room1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26),TypeOfVacation.REKREACNI );
        Booking booking2 = new Booking(room3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), TypeOfVacation.PRACOVNI);

        Reservations reservations = new Reservations();
        reservations.addBooking(booking1);
        reservations.addBooking(booking2);
        reservations.writeReservations();
    }
}
