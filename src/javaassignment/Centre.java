package javaassignment;

import java.util.ArrayList;

public class Centre {
    private int id;
    private String healthFacility;
    private String location;
    private ArrayList<Appointment> allAppointment;
    private ArrayList<Vaccine> allVaccine;

    public Centre(int id, String healthFacility, String location) {
        this.id = id;
        this.healthFacility = healthFacility;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHealthFacility() {
        return healthFacility;
    }

    public void setHealthFacility(String healthFacility) {
        this.healthFacility = healthFacility;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Appointment> getAllAppointment() {
        return allAppointment;
    }

    public void setAllAppointment(ArrayList<Appointment> allAppointment) {
        this.allAppointment = allAppointment;
    }

    public ArrayList<Vaccine> getAllVaccine() {
        return allVaccine;
    }

    public void setAllVaccine(ArrayList<Vaccine> allVaccine) {
        this.allVaccine = allVaccine;
    }
    
    
}
