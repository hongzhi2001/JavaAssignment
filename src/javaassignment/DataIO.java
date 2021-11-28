package javaassignment;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class DataIO {
    public static ArrayList<Personnel> allPersonnel 
            = new ArrayList<Personnel>();
    public static ArrayList<People> allPeople
            = new ArrayList<People>();
    public static ArrayList<Appointment> allAppointment
            = new ArrayList<Appointment>();
    public static ArrayList<Centre> allCentre
            = new ArrayList<Centre>();
    public static ArrayList<Vaccine> allVaccine
            = new ArrayList<Vaccine>();
        public static void read(){
            allPeople.clear();
            allAppointment.clear();
            allPersonnel.clear();
            allVaccine.clear();
            allCentre.clear();
        try{
            Scanner s = new Scanner(new File("people.txt"));
            while(s.hasNext()){
                int x1 = Integer.parseInt(s.nextLine());
                String x2 = s.nextLine();
                String x3 = s.nextLine();
                String x4 = s.nextLine();
                String x5 = s.nextLine();
                String x6 = s.nextLine();
                String x7 = s.nextLine();
                int x8 = Integer.parseInt(s.nextLine());
                int x9 = Integer.parseInt(s.nextLine());
                s.nextLine();
                People p = new People(x1,x2,x3,x4,x5,x6,x7,x8,x9);
                allPeople.add(p);
            }
            Scanner s1 = new Scanner(new File("centre.txt"));
            while(s1.hasNext()){
                int x1 = Integer.parseInt(s1.nextLine());
                String x2 = s1.nextLine();
                String x3 =s1.nextLine();                
                s1.nextLine();
                Centre c = new Centre(x1,x2,x3);
                allCentre.add(c);    
            }
            Scanner s2 = new Scanner(new File("appointment.txt"));
            while(s2.hasNext()){
                int x1 = Integer.parseInt(s2.nextLine());
                String x2 = s2.nextLine();
                String x3 =s2.nextLine();
                int x4 = Integer.parseInt(s2.nextLine());
                int x5 = Integer.parseInt(s2.nextLine());
                People x6 = checkPeople(s2.nextLine());
                Centre x7 = checkCentre(s2.nextLine());                
                s2.nextLine();
                Appointment a = new Appointment(x1,x2,x3,x4,x5,x6,x7);
                allAppointment.add(a);
                x6.getMyAppointment().add(a);
                x7.getAllAppointment().add(a);              
            }
            Scanner s3 = new Scanner(new File("vaccine.txt"));
            while(s3.hasNext()){
                int x1 = Integer.parseInt(s3.nextLine());
                String x2 = s3.nextLine();
                String x3 =s3.nextLine();
                int x4 = Integer.parseInt(s3.nextLine());                
                Centre x5 = checkCentre(s3.nextLine());                
                s3.nextLine();
                Vaccine v = new Vaccine(x1,x2,x3,x4,x5);
                allVaccine.add(v);    
                x5.getAllVaccine().add(v);
            }          
            Scanner s4 = new Scanner(new File("personnel.txt"));
            while(s4.hasNext()){
                int x1 = Integer.parseInt(s4.nextLine());
                String x2 = s4.nextLine();
                String x3 = s4.nextLine();
                String x4 = s4.nextLine();
                String x5 = s4.nextLine();
                String x6 = s4.nextLine();
                s4.nextLine();
                Personnel ps = new Personnel(x1,x2,x3,x4,x5,x6);
                allPersonnel.add(ps);
            }
        } catch(Exception e){
            System.out.println("Error in read!");
            e.printStackTrace();
        }
    }
    public static void write(){
        try{
            PrintWriter a = new PrintWriter("people.txt");
            for(int i=0; i<allPeople.size(); i++){
                a.println(allPeople.get(i).getId());
                a.println(allPeople.get(i).getName());
                a.println(allPeople.get(i).getIdentityNo());
                a.println(allPeople.get(i).getDob());
                a.println(allPeople.get(i).getPhoneNo());
                a.println(allPeople.get(i).getEmail());
                a.println(allPeople.get(i).getAddress());
                a.println(allPeople.get(i).getStatus());
                a.println(allPeople.get(i).getType());
                a.println();
            }
            a.close();
            PrintWriter b = new PrintWriter("appointment.txt");
            for(int i=0; i<allAppointment.size(); i++){
                b.println(allAppointment.get(i).getId());
                b.println(allAppointment.get(i).getAppointmentDate());
                b.println(allAppointment.get(i).getTime());
                b.println(allAppointment.get(i).getStatus());
                b.println(allAppointment.get(i).getDos());
                b.println(allAppointment.get(i).getOwner().getIdentityNo());
                b.println(allAppointment.get(i).getAppointCentre().getHealthFacility());
                b.println();
            }
            b.close();
            PrintWriter c = new PrintWriter("personnel.txt");
            for(int i=0; i<allPersonnel.size(); i++){
                c.println(allPersonnel.get(i).getId());
                c.println(allPersonnel.get(i).getName());
                c.println(allPersonnel.get(i).getIdentityNo());
                c.println(allPersonnel.get(i).getDob());
                c.println(allPersonnel.get(i).getPhoneNo());
                c.println(allPersonnel.get(i).getEmail());
                c.println();
            }
            c.close();
            PrintWriter d = new PrintWriter("vaccine.txt");
            for(int i=0; i<allVaccine.size(); i++){
                d.println(allVaccine.get(i).getVaccineNo());
                d.println(allVaccine.get(i).getName());
                d.println(allVaccine.get(i).getManufacture());
                d.println(allVaccine.get(i).getQuantity());
                d.println(allVaccine.get(i).getVaccineCentre().getHealthFacility());
                d.println();
            }
            d.close();
            PrintWriter e = new PrintWriter("centre.txt");
            for(int i=0; i<allCentre.size(); i++){
                e.println(allCentre.get(i).getId());
                e.println(allCentre.get(i).getHealthFacility());
                e.println(allCentre.get(i).getLocation());
                e.println();
            }
            e.close();
        } catch(Exception e){
            System.out.println("Error in write!");
        } 
    }
    public static Personnel checkPersonnel(String x){
        for(int i=0; i<allPersonnel.size(); i++){
            if(x.equals(allPersonnel.get(i).getIdentityNo())){
                return allPersonnel.get(i);
            }
        }
        return null;
    }
    
    public static People checkPeople(String x){
        for(int i=0; i<allPeople.size(); i++){
            if(x.equals(allPeople.get(i).getIdentityNo())){
                return allPeople.get(i);
            }
        }
        return null;
    }
    
    public static Centre checkCentre(String x){
        for(int i=0; i<allCentre.size(); i++){
            if(x.equals(allCentre.get(i).getHealthFacility())){
                return allCentre.get(i);
            }
        }
        return null;
    }
    
}
