package javaassignment;

public class Noncitizen extends People implements Operation{

    public Noncitizen(int Id, String name, int passportNo, String Dob, int phoneNo, String email, String address, int status) {
        super(Id, name, passportNo, Dob, phoneNo, email, address, status, 2);
    }
    
    @Override
    public void registerNew(People x){
        DataIO.allPeople.add(x);
        DataIO.write();
    }
    
}
