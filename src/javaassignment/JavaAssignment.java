package javaassignment;

public class JavaAssignment {
    public static Register R = new Register();
    public static PeopleLogin PL = new PeopleLogin();
    public static People login;
    public static Home h = new Home();
    public static PeopleMyProfile pm = new PeopleMyProfile();
    public static PeopleAppointment pa = new PeopleAppointment();
    public static void main(String[] args) {
        DataIO.read();
    }
    
}
