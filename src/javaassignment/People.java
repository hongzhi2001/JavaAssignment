package javaassignment;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class People implements Operation{
    private int Id;
    private String name;
    private String identityNo;
    private String Dob;
    private String phoneNo;
    private String email;
    private String address;
    private int status;
    private int type;
    private ArrayList<Appointment> myAppointment = new ArrayList<Appointment>();
    private ArrayList<Vaccine> myVaccine = new ArrayList<Vaccine>();

    public People(int Id, String name, String identityNo, String Dob, String phoneNo, String email, String address, int status, int type) {
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
    
    @Override
    public void registerNew(People x){
        DataIO.allPeople.add(x);
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
    
    public void addAppointment(Appointment x){
        DataIO.allAppointment.add(x);
        DataIO.write();
    }
    
    public void viewAppointment(JTable x){  // NOT DONE
        DataIO.read();
        String[] data = new String[5];
        String status;
        
        String[] columnNames = { "Date", "Time", "Status", "Dos", "Centre" };
        DefaultTableModel model = (DefaultTableModel)x.getModel();
        model.setColumnIdentifiers(columnNames);     
        
        try{
            for(int i=0;i<myAppointment.size();i++){
                Appointment a = myAppointment.get(i);
                if(a.getStatus()==0){
                    status="Pending";
                }else if(a.getStatus()==1){
                    status="Accepted";
                }else if(a.getStatus()==2){
                    status="Cancelled";
                }else{
                    status="Completed";
                }
                
                data[0] = ""+a.getAppointmentDate();
                data[1] = ""+a.getTime();
                data[2] = ""+status;
                data[3] = ""+String.valueOf(a.getDos());             
                data[4] = ""+a.getAppointCentre().getHealthFacility();
                model.addRow(data);
            }
        } catch(Exception e){           
            System.out.println("Error!");
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
        DataIO.read();
        
        for(int i=0;i<myVaccine.size();i++){
            Vaccine v = myVaccine.get(i);            
            String id = String.valueOf(v.getVaccineNo());
            String name = v.getName();
            String manufacture = v.getManufacture();
            String healtfacility = String.valueOf(v.getVaccineCentre());   
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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
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