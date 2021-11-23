package javaassignment;

public class Citizen extends People {
    private String icNo;
    
    public Citizen(int Id, String name, String icNo, String Dob, int phoneNo, String email, String address, int status) {
        super(Id, name, icNo, Dob, phoneNo, email, address, status, 1);
        this.icNo = icNo;
    }

    public String getIcNo() {
        return icNo;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo;
    } 
}
