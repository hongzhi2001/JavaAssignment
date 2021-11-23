package javaassignment;

public class Vaccine {
    private int vaccineNo;
    private String name;
    private String manufacture;
    private String type;
    private String batchNo;
    private int quantity;
    private Centre vaccineCentre;

    public Vaccine(int vaccineNo, String name, String manufacture, String type, String batchNo, int quantity, Centre vaccineCentre) {
        this.vaccineNo = vaccineNo;
        this.name = name;
        this.manufacture = manufacture;
        this.type = type;
        this.batchNo = batchNo;
        this.quantity = quantity;
        this.vaccineCentre = vaccineCentre;
    }

    public int getVaccineNo() {
        return vaccineNo;
    }

    public void setVaccineNo(int vaccineNo) {
        this.vaccineNo = vaccineNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Centre getVaccineCentre() {
        return vaccineCentre;
    }

    public void setVaccineCentre(Centre vaccineCentre) {
        this.vaccineCentre = vaccineCentre;
    }
    
    
    
}
