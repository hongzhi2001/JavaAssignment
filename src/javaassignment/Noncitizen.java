package javaassignment;

public class Noncitizen extends People {
    private String passportNo;

    public Noncitizen(int Id, String name, String passportNo, String Dob, int phoneNo, String email, String address, int status) {
        super(Id, name, passportNo, Dob, phoneNo, email, address, status, 2);
        this.passportNo = passportNo;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }
  
}
