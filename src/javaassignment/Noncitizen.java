package javaassignment;

public class Noncitizen extends People {
    private String passportNo;

    public Noncitizen(int Id, String name, String passportNo, String Dob, String phoneNo, String email, String address, int status) {
        super(Id, name, passportNo, Dob, phoneNo, email, address, status, 0);
        this.passportNo = passportNo;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }
  
}
