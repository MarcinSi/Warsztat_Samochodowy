package pl.coderslab.Car;

import java.util.Date;

public class Car {

    private String model;
    private String brand;
    private Date yearOfProduction;
    private String licensPlate;
    private Date nextService;

    public Car(String model, String brand, Date yearOfProduction, String licensPlate, Date nextService) {
        this.model = model;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.licensPlate = licensPlate;
        this.nextService = nextService;
    }
    public Car(){

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

    public Date getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Date yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getLicensPlate() {
        return licensPlate;
    }

    public void setLicensPlate(String licensPlate) {
        this.licensPlate = licensPlate;
    }

    public Date getNextService() {
        return nextService;
    }

    public void setNextService(Date nextService) {
        this.nextService = nextService;
    }
}