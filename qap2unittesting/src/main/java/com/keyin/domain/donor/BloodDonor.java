package com.keyin.domain.donor;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

public class BloodDonor {
    /*
    o	Donor ID
    o	First Name
    o	Last Name
    o	Date of Birth
    o	Blood Type
    o	Next Appointment
    o	Last Donation Date
    */

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String bloodType;
    private LocalDate nextAppointmentDate;
    private LocalDate lastDonationDate;

    public BloodDonor(){

    }

    public BloodDonor(int id, String firstName, String lastName, LocalDate dateOfBirth, String bloodType, LocalDate nextAppointmentDate,
                      LocalDate lastDonationDate){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nextAppointmentDate = nextAppointmentDate;
        this.lastDonationDate = lastDonationDate;
    }

    public BloodDonor( int id, String firstName, String lastName, LocalDate dateOfBirth, String bloodType, LocalDate lastDonationDate){
        this.id =id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.bloodType = bloodType;
        this.nextAppointmentDate = null;
        this.lastDonationDate = lastDonationDate;
    }

    public BloodDonor(int id, String firstName, String lastName, LocalDate dateOfBirth, String bloodType) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.bloodType = bloodType;
        this.nextAppointmentDate = null;
        this.lastDonationDate = null;
    }

    public long getAge() {
        LocalDate today = LocalDate.now();
        long age = YEARS.between(dateOfBirth, today);
        return age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public LocalDate getNextAppointmentDate() {
        return nextAppointmentDate;
    }

    public void setNextAppointmentDate(LocalDate nextAppointmentDate) {
        this.nextAppointmentDate = nextAppointmentDate;
    }

    public LocalDate getLastDonationDate() {
        return lastDonationDate;
    }

    public void setLastDonationDate(LocalDate lastDonationDate) {
        this.lastDonationDate = lastDonationDate;
    }

    public String toString() {
        return "Blood Donor. ID: " + id + ", First Name: " + firstName + ", Last Name: " + lastName + ", Date of Birth: " + dateOfBirth +
        ", Blood Type: " + bloodType + ", Next Appointment: " + nextAppointmentDate + ", Last Donation Date: " + lastDonationDate;
    }
}
