package com.keyin.domain.appointment;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentSlot {
    private int idl;
    private String location;
    private LocalDate date;
    private LocalTime beginningTime;
    private LocalTime endTime;
    private String bloodType;

    public AppointmentSlot (int idl, String location, LocalDate date, LocalTime beginningTime, LocalTime endTime, String bloodType){
        this.idl = idl;
        this.location = location;
        this.date = date;
        this.beginningTime = beginningTime;
        this.endTime = endTime;
        this.bloodType = bloodType;
    }



    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getIdl() {
        return idl;
    }

    public void setId(int idl) {
        this.idl = idl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setLocalDate() {
        this.date = date;
    }

    public LocalTime getBeginningTIme() {
        return beginningTime;
    }

    public void setBeginningTime() {
        this.beginningTime = beginningTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime() {
        this.endTime = endTime;
    }

    public String toString() {
        return "AppointmentSlot. ID: " + this.idl + ", Location: " + this.location + ", Date: " + this.date + ", Start Time: " + this.beginningTime + ", End Time: " + this.endTime + ", Blood Type: " + this.bloodType;
    }

}
