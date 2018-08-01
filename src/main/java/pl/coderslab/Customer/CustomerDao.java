package pl.coderslab.Customer;

import pl.coderslab.dao.service.DbService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDao {

    public static void save(Customer customer) throws Exception{

        String querry = "Insert INTO customer (`name`, `lastName`, `date_of_birth`) VALUES (?, ?, ?)";
        List<String> params = new ArrayList<>();
        params.add(customer.getName());
        params.add(customer.getLastName());
        params.add(String.valueOf(customer.getDateOfBirth()));

        try {
            int newId = DbService.insertIntoDatabase(querry,params);
            customer.setId(newId);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> printAllCustomers(){
        String querry ="SELECT * from customer";
        List<String[]> results = new ArrayList<>();

        try {
            results = DbService.getData(querry,null);
            for(String[] result : results){
                System.out.println(Arrays.toString(result));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;

    }
}
