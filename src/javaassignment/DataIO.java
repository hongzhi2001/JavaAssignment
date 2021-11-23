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
        try{
            Scanner s = new Scanner(new File("people.txt"));
            while(s.hasNext()){
                String a = s.nextLine();
                int b = Integer.parseInt(s.nextLine());
                s.nextLine();
                People c = new People(a,b);
                allPeople.add(c);
            }
            Scanner s1 = new Scanner(new File("appointment.txt"));
            while(s1.hasNext()){
                int x1 = Integer.parseInt(s1.nextLine());
                String x2 = s.nextLine();
                String x3 =s.nextLine();
                int x4 = Integer.parseInt(s1.nextLine());
                People x5 = checking(s1.nextLine());
                Centre x6 = Centre.valueOf(s1.nextLine());                
                s1.nextLine();
                Appointment y = new Appointment(x1,x2,x3,x4,x5,x6);
                allAppointment.add(y);
                
            }
            Scanner s2 = new Scanner(new File("vaccine.txt"));
            while(s2.hasNext()){
                int x1 = Integer.parseInt(s1.nextLine());
                String x2 = s.nextLine();
                String x3 =s.nextLine();
                String x4 =s.nextLine();
                String x5 =s.nextLine();
                int x6 = Integer.parseInt(s1.nextLine());                
                Centre x7 = Centre.valueOf(s1.nextLine());                
                s1.nextLine();
                Vaccine v = new Vaccine(x1,x2,x3,x4,x5,x6,x7);
                allVaccine.add(v);    
            }
            Scanner s3 = new Scanner(new File("centre.txt"));
            while(s3.hasNext()){
                int x1 = Integer.parseInt(s1.nextLine());
                String x2 = s.nextLine();
                String x3 =s.nextLine();
                String x4 =s.nextLine();
                String x5 =s.nextLine();
                int x6 = Integer.parseInt(s1.nextLine());                
                Centre x7 = Centre.valueOf(s1.nextLine());                
                s1.nextLine();
                Vaccine v = new Vaccine(x1,x2,x3,x4,x5,x6,x7);
                allVaccine.add(v);    
            }
        } catch(Exception e){
            System.out.println("Error in read!");
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
            PrintWriter b = new PrintWriter("appoinment.txt");
            for(int i=0; i<allAppointment.size(); i++){
                b.println(allAppointment.get(i).getId());
                b.println(allAppointment.get(i).getAppointmentDate());
                b.println(allAppointment.get(i).getTime());
                b.println(allAppointment.get(i).getStatus());
                b.println(allAppointment.get(i).getAppointCentre());
                b.println(allAppointment.get(i).getOwner().getName());
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
                d.println(allVaccine.get(i).getType());
                d.println(allVaccine.get(i).getBatchNo());
                d.println(allVaccine.get(i).getQuantity());
                d.println(allVaccine.get(i).getVaccineCentre());
                d.println();
            }
            d.close();
            PrintWriter e = new PrintWriter("centre.txt");
            for(int i=0; i<allCentre.size(); i++){
                e.println(allCentre.get(i).getId());
                e.println(allCentre.get(i).getHealthFacility());
                e.println(allCentre.get(i).getLocation());
                e.println(allCentre.get(i).getAllAppointment());
                e.println(allCentre.get(i).getAllVaccine());
                e.println();
            }
            e.close();
        } catch(Exception e){
            System.out.println("Error in write!");
        }
    }
    public static Personnel checkPersonnel(String x){
        for(int i=0; i<allPersonnel.size(); i++){
            if(x.equals(allPersonnel.get(i).getName())){
                return allPersonnel.get(i);
            }
        }
        return null;
    }
    
    public static People checkPeople(String x){
        for(int i=0; i<allPeople.size(); i++){
            if(x.equals(allPeople.get(i).getName())){
                return allPeople.get(i);
            }
        }
        return null;
    }
}
