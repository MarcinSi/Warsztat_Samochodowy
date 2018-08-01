package pl.coderslab.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/printCustomers")
public class CustomerServletPrint extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String[]> customers;
        customers = CustomerDao.printAllCustomers();
        List<Customer> customersList = new ArrayList<>();
        for(String[] custom: customers){
            Customer customer = new Customer();
            customer.setId(Integer.parseInt(custom[0]));
            customer.setName(custom[1]);
            customer.setLastName(custom[2]);
            //customer.setDateOfBirth(String.valueOf(custom[3]));
            customersList.add(customer);

        }


        request.setAttribute("customersList", customersList);
        getServletContext().getRequestDispatcher("/printcustomers.jsp").forward(request,response);
    }
}
