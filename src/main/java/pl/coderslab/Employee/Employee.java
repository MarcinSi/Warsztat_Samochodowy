package pl.coderslab.Employee;

public class Employee {
    private String name;
    private String lastName;
    private String address;
    private String note;
    private float workingHourCost;

    public Employee() {
    }

    public Employee(String name, String lastName, String address, String note, float workingHourCost) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.note = note;
        this.workingHourCost = workingHourCost;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public float getWorkingHourCost() {
        return workingHourCost;
    }

    public void setWorkingHourCost(float workingHourCost) {
        this.workingHourCost = workingHourCost;
    }
}
