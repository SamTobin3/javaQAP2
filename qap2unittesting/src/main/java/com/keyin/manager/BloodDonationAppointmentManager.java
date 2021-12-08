package com.keyin.manager;

import com.keyin.domain.Database;
import com.keyin.domain.appointment.AppointmentSlot;
import com.keyin.domain.appointment.BloodDonationAppointment;
import com.keyin.domain.donor.BloodDonor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class BloodDonationAppointmentManager {
    private Database database;

    public BloodDonationAppointmentManager(Database database) {
        this.database = database;
    }

    public BloodDonationAppointment bookAppointment(int bloodDonorId) throws InvalidDonationSchedulingException {
        BloodDonationAppointment bloodDonationAppointment = null;

        BloodDonor bloodDonor = database.getDonor(bloodDonorId);

        LocalDate today = LocalDate.now();
        LocalDate tooYoungDate = today.minus(18, ChronoUnit.YEARS);

        if (bloodDonor.getDateOfBirth().isAfter(tooYoungDate)) {
            throw new InvalidDonationSchedulingException("donor too young");
        }

        List<AppointmentSlot> appointmentSlotList = database.getAppointmentSlots();

        for (AppointmentSlot appointmentSlot: appointmentSlotList) {
            if (appointmentSlot.getBloodType().equalsIgnoreCase(bloodDonor.getBloodType())) {
                if (((DAYS.between(bloodDonor.getLastDonationDate(), appointmentSlot.getDate())) <= 365) || (bloodDonationAppointment.getFirstTimeDonor())){
                    bloodDonationAppointment.setLocation(appointmentSlot.getLocation());
                    bloodDonationAppointment.setDate(appointmentSlot.getDate());
                    bloodDonationAppointment.setBeginningTime(appointmentSlot.getBeginningTIme());
                    bloodDonationAppointment.setEndTime(appointmentSlot.getEndTime());
                    bloodDonationAppointment.setIdl("MOCK-APPOINTMENT-123");
                } else if (DAYS.between(bloodDonor.getLastDonationDate(), appointmentSlot.getDate()) < 56) {
                    throw new InvalidDonationSchedulingException("Donor needs to wait a minimum 56 days before next donation.");
                } else {
                    throw new InvalidDonationSchedulingException("Last donation over a year ago");
                }
            } else {
                System.out.println(bloodDonationAppointment);
                throw new InvalidDonationSchedulingException("invalid blood type");
            }
        }

        return bloodDonationAppointment;
    }
}
