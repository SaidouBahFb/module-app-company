package com.groupeisi.ihm;


import com.groupeisi.metier.EmployeeDto;
import com.groupeisi.metier.EmployeeImp;
import com.groupeisi.metier.IEmployees;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "employees", value = "/employees")
public class EmployeeController extends HttpServlet {

    private IEmployees employeesMetier = new EmployeeImp();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EmployeeDto employeeDto = new EmployeeDto("Saidou", "Bah");

        resp.getWriter().print(employeesMetier.save(employeeDto).get().getFirstname());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
