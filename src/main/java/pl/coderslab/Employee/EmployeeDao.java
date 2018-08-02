package pl.coderslab.Employee;

import pl.coderslab.dao.service.DbService;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
=======
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
>>>>>>> 43b94dc452a9e83f6daa61c87eb70e08d3f47ec3
import java.util.List;

public class EmployeeDao {

<<<<<<< HEAD
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

=======
    public static void delete(int employeeId) {
        String query = "DELETE FROM employee WHERE id =?";
        List<String> params = new ArrayList<>();
        params.add(String.valueOf(employeeId));

        try {
            DbService.executeQuery(query, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void save(Employee employee) throws Exception {

        String query = "Insert INTO employee VALUES (null, ?, ?, ?, ?)";
        List<String> params = new ArrayList<>();
        params.add(employee.getName());
        params.add(employee.getLastName());
        params.add(employee.getNote());
        params.add(Float.toString(employee.getWorkingHourCost()));
        DbService.insertIntoDatabase(query, params);

    }

    public static List<Employee> printAllEmployees() throws SQLException {
        String query = "SELECT * from employee";

        try (Connection conn = DbService.createConn()) {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            List<Employee> employees = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String lastName = rs.getString(3);
                String note = rs.getString(4);
                float workingHourCost = rs.getFloat(5);

                employees.add(new Employee(id, name, lastName, note, workingHourCost));
            }
            return employees;

        } catch (SQLException e) {
            throw e;
        }
>>>>>>> 43b94dc452a9e83f6daa61c87eb70e08d3f47ec3
    }
}
