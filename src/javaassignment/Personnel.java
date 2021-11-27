package javaassignment;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Personnel implements Operation{
    private int Id;
    private String name;
    private String identityNo;
    private String Dob;
    private String phoneNo;
    private String email;

    public Personnel(int Id, String name, String identityNo, String Dob, String phoneNo, String email) {
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
        
    
    public static void viewPeople(JTable x){
        DataIO.read();
        String[] data = new String[9];
        String status;
        String userType;
        
        String[] columnNames = { "ID", "Name", "Identity Number","DOB", "Phone Number", "Email Address", "Address", "Status", "User Type" };
        DefaultTableModel model = (DefaultTableModel)x.getModel();
        model.setColumnIdentifiers(columnNames);     
        
        try{
            for(int i=0;i<DataIO.allPeople.size();i++){
                People p = DataIO.allPeople.get(i);
                if(p.getType()==1){
                    userType = "citizen";
                }else {
                    userType = "Non-citizen";
                }
                if(p.getStatus()==0){
                    status="Not Vacinated";
                }else if(p.getStatus()==1){
                    status="1st Dose Completed";
                }else{
                    status="Fully Vacinated";
                }
                data[0] = Integer.toString(p.getId());
                data[1] = ""+p.getName();
                data[2] = ""+p.getIdentityNo();
                data[3] = ""+p.getDob();
                data[4] = ""+p.getPhoneNo();
                data[5] = ""+p.getEmail();
                data[6] = ""+p.getAddress();
                data[7] = ""+status;
                data[8] = ""+userType;
                model.addRow(data);
            } 
        }catch(Exception e){
            System.out.println("Error!");
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
    
    public static void viewAppointment(JTable x){
        DataIO.read();
        String[] data = new String[6];
        String status;
        
        String[] columnNames = { "ID", "Date", "Time", "Status", "Owner", "Centre" };
        DefaultTableModel model = (DefaultTableModel)x.getModel();
        model.setColumnIdentifiers(columnNames);     
        
        try{
            for(int i=0;i<DataIO.allAppointment.size();i++){
                Appointment a = DataIO.allAppointment.get(i);
                if(a.getStatus()==0){
                    status="Pending";
                }else if(a.getStatus()==1){
                    status="Accepted";
                }else{
                    status="Cancelled";
                }
                data[0] = Integer.toString(a.getId());
                data[1] = ""+a.getAppointmentDate();
                data[2] = ""+a.getTime();
                data[3] = ""+status;
                data[4] = ""+a.getOwner();
                data[5] = ""+a.getAppointCentre();
                model.addRow(data);
            } 
        }catch(Exception e){
            System.out.println("Error!");
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
    
    public static void viewVaccine(JTable x){
        DataIO.read();
        String[] data = new String[7];
        
        String[] columnNames = { "VaccineNo", "Name", "Manufacture", "Type", "BatchNo", "Quantity", "Centre" };
        DefaultTableModel model = (DefaultTableModel)x.getModel();
        model.setColumnIdentifiers(columnNames);     
        
        try{
            for(int i=0;i<DataIO.allVaccine.size();i++){
                Vaccine v = DataIO.allVaccine.get(i);
                
                data[0] = Integer.toString(v.getVaccineNo());
                data[1] = ""+v.getName();
                data[2] = ""+v.getManufacture();
                data[3] = ""+v.getType();
                data[4] = ""+v.getBatchNo();
                data[5] = ""+Integer.toString(v.getQuantity());
                data[6] = ""+v.getVaccineCentre();
                model.addRow(data);
            } 
        }catch(Exception e){
            System.out.println("Error!");
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

    
    
}
