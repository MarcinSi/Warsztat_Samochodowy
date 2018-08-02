package pl.coderslab.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
<<<<<<< HEAD
import java.util.Arrays;
import java.util.List;

@WebServlet("/printEmployees")
public class EmployeeServletPrint extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String[]> employees = EmployeeDao.printAllEmployees();


        request.setAttribute("employees", employees);
        getServletContext().getRequestDispatcher("/printemployees.jsp").forward(request, response);
=======
import java.sql.SQLException;
import java.util.List;

@WebServlet("/printemployees")
public class EmployeeServletPrint extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employees = null;
        try {
            employees = EmployeeDao.printAllEmployees();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        request.setAttribute("employees", employees);
        getServletContext().getRequestDispatcher("/printemployees.jsp").forward(request,response);
>>>>>>> 43b94dc452a9e83f6daa61c87eb70e08d3f47ec3
    }
}
