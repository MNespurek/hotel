package com.engeto.hotel;

import java.time.LocalDate;
import java.util.List;

public class Main {
    private static final BookingManager bookingManager = new BookingManager();
    public static void main(String[] args) {

        Guest guest = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest1 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 15));
        System.out.println("" + guest1.getFirstName() + " " + guest1.getSecondName() + " " + guest1.getBirth() + ".");
        System.out.println("" + guest.getFirstName() + " " + guest.getSecondName() + " " + guest.getBirth() + ".");

        Room room1 = new Room(1, 1, true, true, 1100);
        Room room2 = new Room(2, 1, true, true, 1100);
        Room room3 = new Room(3, 3, false, true, 2400);

        Booking booking1 = new Booking(room1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), TypeOfVacation.REKREACNI);
        Booking booking2 = new Booking(room3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), TypeOfVacation.PRACOVNI);

        booking1.addGuest(guest);
        booking2.addGuest(guest);
        booking2.addGuest(guest1);

        bookingManager.addBooking(booking1);
        Booking booking3 = new Booking(room2, LocalDate.of(2021, 11, 1), LocalDate.of(2021, 11,  11), TypeOfVacation.PRACOVNI);
        bookingManager.addBooking(booking2);
        booking3.addGuest(guest1);
        bookingManager.addBooking(booking3);
        bookingManager.writeReservations();
        System.out.println(bookingManager.getNumberOfWorkingBookings());
        System.out.println(bookingManager.getAverageGuests());
        System.out.println(bookingManager.listOfReservations.size());
        fillBookings();
        System.out.println(bookingManager.listOfReservations.size());
        for (Booking booking : bookingManager.listOfReservations) {
            System.out.println("Od " +booking.getBeginDate()+ "do "+booking.getEndDate()+" jméno hlavního hosta " +booking.getFirstGuest().getFirstName()+" " +booking.getFirstGuest().getSecondName()+" " +booking.getFirstGuest().getBirth()+" [ "+booking.getNumberOfGuest()+" "+booking.getRoom().getBalconey()+"] za cenu: " +booking.getRoom().getPrice()+ "Kč");
        }
        bookingManager.limitReservations(8);
        printGuestsStatistics();
        System.out.println(booking2.getBookingLength());
        System.out.println(booking3.getBookingLength());
        System.out.println(booking3.getPrice());
    }
    private static void fillBookings() {
        Guest guest = new Guest("Karel", "Dvořák", LocalDate.of(1990, 5, 15));
        Guest guest1 = new Guest("Karel", "Dvořák", LocalDate.of(1979, 1, 3));
        Guest guest2 = new Guest("Karolína", "Tmavá", LocalDate.of(2000, 1, 1));


        Room room2 = new Room(2, 1, true, true, 1100);
        Room room3 = new Room(3, 3, false, true, 2400);
        Booking booking4 = new Booking(room3, LocalDate.of(2023, 1, 6), LocalDate.of(2023, 6, 7), TypeOfVacation.PRACOVNI);
        Booking booking5 = new Booking(room2, LocalDate.of(2023, 7, 18), LocalDate.of(2023, 7, 21), TypeOfVacation.REKREACNI);


        booking4.addGuest(guest);
        booking5.addGuest(guest1);
        bookingManager.addBooking(booking4);
        bookingManager.addBooking(booking5);

        for (int i=1, j=2; i <=19; i +=2, j+=2) {

            Booking booking6 = new Booking(room2, LocalDate.of(2023, 8, i), LocalDate.of(2023, 8, j), TypeOfVacation.REKREACNI);
            booking6.addGuest(guest2);
            bookingManager.addBooking((booking6));
            }
    }
    private static void printGuestsStatistics() {
        int oneGuestNumberOfReservations = 0;
        int twoGuestNumberOfReservations = 0;
        int moreGuestNumberOfReservations = 0;
        for (Booking bookingManager : bookingManager.listOfReservations) {

            if (bookingManager.getNumberOfGuest() == 1) {
                oneGuestNumberOfReservations += 1;
            } else if (bookingManager.getNumberOfGuest() == 2) {
                twoGuestNumberOfReservations += 1;
            } else {
                moreGuestNumberOfReservations += 1;
            }
        }
        System.out.println("jednolůžkových rezervací je: " +oneGuestNumberOfReservations+ ", dvoulůžkových rezervací je: " +twoGuestNumberOfReservations+ ", vícelůžkových rezervací je: " +moreGuestNumberOfReservations+ ".");
    }
}

