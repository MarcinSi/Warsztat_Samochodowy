package pl.coderslab.Employee;

import pl.coderslab.dao.service.DbService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDao {

    public static void save(Employee employee) throws Exception {

        String querry = "Insert INTO employee (`name`, `lastName`, `address`, `note`, `workingHourCost`) VALUES (?, ?, ?, ?, ?)";
        List<String> params = new ArrayList<>();
        params.add(employee.getName());
        params.add(employee.getLastName());
        params.add(employee.getAddress());
        params.add(employee.getNote());
        params.add(String.valueOf(employee.getWorkingHourCost()));

        try {
            int newId = DbService.insertIntoDatabase(querry, params);
            employee.setId(newId);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> printAllEmployees() {
        String querry = "SELECT * from employee";
        List<String[]> results = new ArrayList<>();

        try {
            results = DbService.getData(querry, null);
            for (String[] result : results) {
                System.out.println(Arrays.toString(result));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;

    }
}
