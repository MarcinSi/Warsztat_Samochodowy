package pl.coderslab.Customer;

import java.util.Date;

public class CustomerServise {

    public static void add(String name, String lastName,Date dateOfBirth) {
        Customer customer = new Customer(name, lastName, dateOfBirth);
        try {
            CustomerDao.save(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(int customerId){
        CustomerDao.delete(customerId);
    }
}
