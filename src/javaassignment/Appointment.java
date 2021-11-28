package javaassignment;

public class Appointment {
    private int id;
    private String appointmentDate;
    private String time;
    private int status;
    private int dos;
    private People owner;
    private Centre appointCentre;

    public Appointment(int id, String appointmentDate, String time, int status, int dos, People owner, Centre centre) {
        this.id = id;
        this.appointmentDate = appointmentDate;
        this.time = time;
        this.status = status;
        this.dos = dos;
        this.owner = owner;
        this.appointCentre = centre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    
    public void cancelAppointment(){
        status = 0;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDos() {
        return dos;
    }

    public void setDos(int dos) {
        this.dos = dos;
    }

    public People getOwner() {
        return owner;
    }

    public void setOwner(People owner) {
        this.owner = owner;
    }

    public Centre getAppointCentre() {
        return appointCentre;
    }

    public void setAppointCentre(Centre appointCentre) {
        this.appointCentre = appointCentre;
    }

    
    
}
