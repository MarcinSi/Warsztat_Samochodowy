package pl.coderslab.Car;

import java.util.Date;

public class Car {
    private String model;
    private String brand;
    private Date dateOfProduction;
    private int registrationNumber;
    private Date nextTechnicalInspectionDate;

    public Car() {
    }

    public Car(String model, String brand, Date dateOfProduction, int registrationNumber, Date nextTechnicalInspectionDate) {
        this.model = model;
        this.brand = brand;
        this.dateOfProduction = dateOfProduction;
        this.registrationNumber = registrationNumber;
        this.nextTechnicalInspectionDate = nextTechnicalInspectionDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(Date dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Date getNextTechnicalInspectionDate() {
        return nextTechnicalInspectionDate;
    }

    public void setNextTechnicalInspectionDate(Date nextTechnicalInspectionDate) {
        this.nextTechnicalInspectionDate = nextTechnicalInspectionDate;
    }
}
