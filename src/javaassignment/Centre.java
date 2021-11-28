package javaassignment;

import java.util.ArrayList;

public class Centre {
    private int Id;
    private String healthFacility;
    private String location;
    private ArrayList<Appointment> allAppointment = new ArrayList<Appointment>();
    private ArrayList<Vaccine> allVaccine = new ArrayList<Vaccine>();

    public Centre(int Id, String healthFacility, String location) {
        this.Id = Id;
        this.healthFacility = healthFacility;
        this.location = location;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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
