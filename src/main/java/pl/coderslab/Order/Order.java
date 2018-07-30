package pl.coderslab.Order;

import pl.coderslab.Car.Car;
import pl.coderslab.Employee.Employee;

import java.util.Date;

public class Order{
    /*
    * Date when car arrive
    * */
    private Date acceptanceDate;
    /*
    * Estimate date when car will be repaired
    * */
    private Date estimateStartDate;
    /*
    * Start repair car date
    * */
    private Date startWorkDate;
    /*
    * Assigned employee for repair
    * */
    private Employee employeeAssigned;
    private String problemDetails;
    private String repairDetails;
    private String status;
    private Car car ;
    private float totalCostForCustomer;
    private float totalCostOfThePartsUsed;
    private float workingHourCost;
    private int workHoursCount;


    public Order(Date acceptanceDate, Date estimateStartDate, Date startWorkDate, Employee employeeAssigned, String problemDetails, String repairDetails, String status, Car car, float totalCostForCustomer, float totalCostOfThePartsUsed, int workHoursCount) {
        this.acceptanceDate = acceptanceDate;
        this.estimateStartDate = estimateStartDate;
        this.startWorkDate = startWorkDate;
        this.employeeAssigned = employeeAssigned;
        this.problemDetails = problemDetails;
        this.repairDetails = repairDetails;
        this.status = status;
        this.car = car;
        this.totalCostForCustomer = totalCostForCustomer;
        this.totalCostOfThePartsUsed = totalCostOfThePartsUsed;
        this.workHoursCount = workHoursCount;
        workingHourCost = employeeAssigned.getWorkingHourCost();
    }

    public Date getAcceptanceDate() {
        return acceptanceDate;
    }

    public void setAcceptanceDate(Date acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
    }

    public Date getEstimateStartDate() {
        return estimateStartDate;
    }

    public void setEstimateStartDate(Date estimateStartDate) {
        this.estimateStartDate = estimateStartDate;
    }

    public Date getStartWorkDate() {
        return startWorkDate;
    }

    public void setStartWorkDate(Date startWorkDate) {
        this.startWorkDate = startWorkDate;
    }

    public Employee getEmployeeAssigned() {
        return employeeAssigned;
    }

    public void setEmployeeAssigned(Employee employeeAssigned) {
        this.employeeAssigned = employeeAssigned;
    }

    public String getProblemDetails() {
        return problemDetails;
    }

    public void setProblemDetails(String problemDetails) {
        this.problemDetails = problemDetails;
    }

    public String getRepairDetails() {
        return repairDetails;
    }

    public void setRepairDetails(String repairDetails) {
        this.repairDetails = repairDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public float getTotalCostForCustomer() {
        return totalCostForCustomer;
    }

    public void setTotalCostForCustomer(float totalCostForCustomer) {
        this.totalCostForCustomer = totalCostForCustomer;
    }

    public float getTotalCostOfThePartsUsed() {
        return totalCostOfThePartsUsed;
    }

    public void setTotalCostOfThePartsUsed(float totalCostOfThePartsUsed) {
        this.totalCostOfThePartsUsed = totalCostOfThePartsUsed;
    }

    public float getWorkingHourCost() {
        return workingHourCost;
    }

    public void setWorkingHourCost(float workingHourCost) {
        this.workingHourCost = workingHourCost;
    }

    public int getWorkHoursCount() {
        return workHoursCount;
    }

    public void setWorkHoursCount(int workHoursCount) {
        this.workHoursCount = workHoursCount;
    }
}
