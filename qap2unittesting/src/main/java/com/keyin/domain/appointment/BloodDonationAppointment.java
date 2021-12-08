package com.keyin.domain.appointment;

import java.time.LocalDate;
import java.time.LocalTime;

public class BloodDonationAppointment {
    private String idl;
    private LocalDate date;
    private LocalTime beginningTime;
    private LocalTime endTime;
    private String location;
    private String bloodType;
    private boolean firstTimeDonor;
    private int donorId;

    public BloodDonationAppointment(){

    }

    public BloodDonationAppointment(String bloodType, boolean firstTimeDonor, int donorId) {
        this.bloodType = bloodType;
        this.firstTimeDonor = firstTimeDonor;
        this.donorId = donorId;
    }

    public String getIdl() {
        return idl;
    }

    public void setIdl(String idl){
        this.idl = idl;

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getBeginningTime() {
        return beginningTime;
    }
    public void setBeginningTime(LocalTime beginningTime){
        this.beginningTime = beginningTime;
    }

    public LocalTime getEndTime(){
        return endTime;
    }

    public void setEndTime(LocalTime endTime){
        this.endTime = endTime;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public boolean getFirstTimeDonor() {
        return firstTimeDonor;
    }

    public void setFirstTimeDonor(boolean firstTimeDonor) {
        this.firstTimeDonor = firstTimeDonor;
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId){
        this.donorId = donorId;
    }

    public String toString(){
        return "Blood Donation Appointment. ID: " + this.idl + ", Location: " + this.location + ", Date; " + this.date +
                ", Start Time: " + this.beginningTime + ", End Time: " + this.endTime + ", Blood Type: " + this.bloodType +
                ", First Time Donor?: " + this.firstTimeDonor + ", Donor ID: " + this.donorId;
    }
}
