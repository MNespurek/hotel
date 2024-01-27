package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Booking {

    //List<Booking> bookingList = new ArrayList<>();

    List<Guest> roomGuests = new ArrayList<>();
    private Room room;
    private LocalDate beginDate;
    private LocalDate endDate;
    private TypeOfVacation typeOfVacation;

    public Booking(Room room, LocalDate beginDate, LocalDate endDate, TypeOfVacation typeOfVacation) {
        this.room = room;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.typeOfVacation = typeOfVacation;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setTypeOfVacation(TypeOfVacation typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }
    public TypeOfVacation getTypeOfVacation() {
        return typeOfVacation;
    }

    public void addGuest(Guest guest) {
        roomGuests.add(guest);
    }
    public void getGuests() {
        for (Guest writeGuests : roomGuests) {
            System.out.println(roomGuests.size());
            System.out.println("Host na pokoji " +getRoom().getNumber()+": ");
            System.out.println(" je " + writeGuests.getFirstName() + " " + writeGuests.getSecondName() + ".");
        }
    }
}

