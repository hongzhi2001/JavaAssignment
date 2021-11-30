package javaassignment;

import javax.swing.JTable;

public interface Operation {
    public void registerNew(People x);
    public void updateProfile(People x, People y);
    public void updateAppointment(Appointment x, Appointment y);
    public void updateVaccine(Vaccine x, Vaccine y);
}
