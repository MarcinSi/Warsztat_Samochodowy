package pl.coderslab.Customer;

import java.util.Date;

public class Customer {
    private String name;
    private String lastName;
    private Date DateOfBirth;
    private int id;
    //private int order_id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public int getOrder_id() {
//        return order_id;
//    }
//
//    public void setOrder_id(int order_id) {
//        this.order_id = order_id;
//    }

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
