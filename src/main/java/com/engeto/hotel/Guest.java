package com.engeto.hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Guest {
    private String firstName;
    private String secondName;
    private LocalDate birth;


    public Guest(String firstName, String secondName, LocalDate birth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birth = birth;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return  firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }
    public String getBirth() {
        return "("+birth+")";
    }
}


