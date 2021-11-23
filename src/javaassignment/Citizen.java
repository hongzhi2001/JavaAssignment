package javaassignment;

public class Citizen extends People implements Operation{

    public Citizen(int Id, String name, int icNo, String Dob, int phoneNo, String email, String address, int status) {
        super(Id, name, icNo, Dob, phoneNo, email, address, status, 1);
    }
    
    @Override
    public void registerNew(People x){
        DataIO.allPeople.add(x);
        DataIO.write();
    }
    
}
