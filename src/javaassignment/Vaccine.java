package javaassignment;

import java.util.ArrayList;

public class Vaccine {
    private int vaccineNo;
    private String name;
    private String manufacture;
    private int quantity;
    private Centre vaccineCentre;
    private ArrayList<Appointment> allAppointment = new ArrayList<Appointment>();

    public Vaccine(int vaccineNo, String name, String manufacture, int quantity, Centre vaccineCentre) {
        this.vaccineNo = vaccineNo;
        this.name = name;
        this.manufacture = manufacture;
        this.quantity = quantity;
        this.vaccineCentre = vaccineCentre;
    }

    public int getVaccineNo() {
        return vaccineNo;
    }

    public void setVaccineNo(int vaccineNo) {
        this.vaccineNo = vaccineNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void bookVaccine(){
        quantity=quantity-1;
    }
    
    public void cancelVaccine(){
        quantity=quantity+1;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Centre getVaccineCentre() {
        return vaccineCentre;
    }

    public void setVaccineCentre(Centre vaccineCentre) {
        this.vaccineCentre = vaccineCentre;
    }

    public ArrayList<Appointment> getAllAppointment() {
        return allAppointment;
    }

    public void setAllAppointment(ArrayList<Appointment> allAppointment) {
        this.allAppointment = allAppointment;
    }
    
    
    
}
