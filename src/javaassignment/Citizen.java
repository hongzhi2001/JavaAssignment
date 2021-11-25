package javaassignment;

public class Citizen extends People {
    private String icNo;
    
    public Citizen(int Id, String name, String icNo, String Dob, String phoneNo, String email, String address) {
        super(Id, name, icNo, Dob, phoneNo, email, address, 0, 1);
        this.icNo = icNo;
    }

    public String getIcNo() {
        return icNo;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo;
    } 
}
