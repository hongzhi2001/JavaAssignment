package javaassignment;

public class Appointment {
    private int id;
    private String appointmentDate;
    private String time;
    private int status;
    private People owner;
    private Centre centre;

    public Appointment(int id, String appointmentDate, String time, int status, People owner, Centre centre) {
        this.id = id;
        this.appointmentDate = appointmentDate;
        this.time = time;
        this.status = status;
        this.owner = owner;
        this.centre = centre;
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

    public People getOwner() {
        return owner;
    }

    public void setOwner(People owner) {
        this.owner = owner;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }
    
    
}
