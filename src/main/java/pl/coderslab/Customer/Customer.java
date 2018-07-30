package pl.coderslab.Customer;

import java.util.Date;

public class Customer {
    private String name;
    private String lastName;
    private Date DateOfBirth;

    public Customer() {
    }

    public Customer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Customer(String name, String lastName, Date dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        DateOfBirth = dateOfBirth;
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

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
}
