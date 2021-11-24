package javaassignment;

import java.util.ArrayList;

public class Personnel implements Operation{
    private int Id;
    private String name;
    private String identityNo;
    private String Dob;
    private int phoneNo;
    private String email;

    public Personnel(int Id, String name, String identityNo, String Dob, int phoneNo, String email) {
        this.Id = Id;
        this.name = name;
        this.identityNo = identityNo;
        this.Dob = Dob;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    @Override
    public void registerNew(People x){
        DataIO.allPeople.add(x);
        DataIO.write();
    }
    
    public void registerNew(Personnel x){
        DataIO.allPersonnel.add(x);
        DataIO.write();
    }
    
    @Override
    public void updateProfile(People x, People y){
        for(int i=0;i<DataIO.allPeople.size();i++){
            if(x==DataIO.allPeople.get(i)){
                DataIO.allPeople.remove(i);
                DataIO.allPeople.add(i, y);
                DataIO.write();
                break;
            }
            
        }
    }
    
    public void updateProfile(Personnel x, Personnel y){
         for(int i=0;i<DataIO.allPersonnel.size();i++){
            if(x==DataIO.allPersonnel.get(i)){
                DataIO.allPersonnel.remove(i);
                DataIO.allPersonnel.add(i, y);
                DataIO.write();
                break;
            }
            
        }
    }
    
    public void deletePeople(People x){
        for(int i=0;i<DataIO.allPeople.size();i++){
            if(x==DataIO.allPeople.get(i)){
                DataIO.allPeople.remove(i);
                DataIO.write();
                break;
            }
        }
    }
        
    
    public void viewPeople(){
        for(int i=0;i<DataIO.allPeople.size();i++){
            People p = DataIO.allPeople.get(i);
            
        }
    }
    
    public void addAppointment(Appointment x){
        DataIO.allAppointment.add(x);
        DataIO.write();
    }
    
    public void deleteAppointment(Appointment x){
         for(int i=0;i<DataIO.allAppointment.size();i++){
            if(x==DataIO.allAppointment.get(i)){
                DataIO.allAppointment.remove(i);
                DataIO.write();
                break;
            }
        }
    }
    
    public void updateAppointment(Appointment x, Appointment y){
         for(int i=0;i<DataIO.allAppointment.size();i++){
            if(x==DataIO.allAppointment.get(i)){
                DataIO.allAppointment.remove(i);
                DataIO.allAppointment.add(i, y);
                DataIO.write();
                break;
            }
            
        }
    }
    
    @Override
    public void viewAppointment(){
        for(int i=0;i<DataIO.allAppointment.size();i++){
            Appointment x = DataIO.allAppointment.get(i);
            
        }
    }
    
    public void addVaccine(Vaccine x){
        DataIO.allVaccine.add(x);
        DataIO.write();
    }
    
    public void deleteVaccine(Vaccine x){
         for(int i=0;i<DataIO.allVaccine.size();i++){
            if(x==DataIO.allVaccine.get(i)){
                DataIO.allVaccine.remove(i);
                DataIO.write();
                break;
            }
        }
    }
    
    public void updateVaccine(Vaccine x, Vaccine y){
         for(int i=0;i<DataIO.allVaccine.size();i++){
            if(x==DataIO.allVaccine.get(i)){
                DataIO.allVaccine.remove(i);
                DataIO.allVaccine.add(i, y);
                DataIO.write();
                break;
            }
            
        }
    }
    
    public void viewVaccine(){
        for(int i=0;i<DataIO.allVaccine.size();i++){
            Vaccine x = DataIO.allVaccine.get(i);
            
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

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
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

    
    
}
