package javaassignment;

public class JavaAssignment1 {
    public static PLogin pLogin = new PLogin();
    public static PRegister pRegister = new PRegister();
    public static PHome pHome = new PHome();
    public static UserManagement pUser = new UserManagement();
    public static AppointmentManage pAppointment = new AppointmentManage();
    public static VaccineManage pVaccine = new VaccineManage();
    public static PMyprofile pMyProfile = new PMyprofile();
    public static Personnel plogin;
    
    public static void main(String[] args) {
        DataIO.read();
    }
    
}
