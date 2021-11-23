package javaassignment;

import java.util.ArrayList;

public class People {
    private int Id;
    private String name;
    private int identityNo;
    private String Dob;
    private int phoneNo;
    private String email;
    private String address;
    private int status;
    private int type;
    private ArrayList<Appointment> myAppointment;
    private ArrayList<Vaccine> myVaccine;

    public People(int Id, String name, int identityNo, String Dob, int phoneNo, String email, String address, int status, int type) {
        this.Id = Id;
        this.name = name;
        this.identityNo = identityNo;
        this.Dob = Dob;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.status = status;
        this.type = type;
    }
    
    public void viewAppointment(){  // NOT DONE
        
        for(int i=0;i<myAppointment.size();i++){
            Appointment x = myAppointment.get(i);
            
        }
    }
    
    public void cancelAppointment(Appointment x){
        for (int i = 0; i < DataIO.allAppointment.size(); i++) {
            if (x == DataIO.allAppointment.get(i)) {
                DataIO.allAppointment.get(i).cancelAppointment();
                DataIO.write();
                break;
            };
        }
    }
    
    public void viewVaccine(){  // NOT DONE
        
        for(int i=0;i<myVaccine.size();i++){
            Vaccine x = myVaccine.get(i);
            
        }
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(int identityNo) {
        this.identityNo = identityNo;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public ArrayList<Appointment> getMyAppointment() {
        return myAppointment;
    }

    public void setMyAppointment(ArrayList<Appointment> myAppointment) {
        this.myAppointment = myAppointment;
    }

    public ArrayList<Vaccine> getMyVaccine() {
        return myVaccine;
    }

    public void setMyVaccine(ArrayList<Vaccine> myVaccine) {
        this.myVaccine = myVaccine;
    }

    
}