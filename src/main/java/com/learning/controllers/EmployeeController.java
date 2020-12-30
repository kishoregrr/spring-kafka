package com.learning.controllers;


import com.learning.dao.EmployeeDAO;
import com.learning.dao.EmployeeDAOHibernateImpl;
import com.learning.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    @Qualifier("hibernateBean")
    private EmployeeDAO employeeDAO;

   @RequestMapping(method = RequestMethod.GET, value = "/employees")
    public List<Employee> getEmployees() {
        List<Employee> listOfEmps = employeeDAO.findAll();
        return listOfEmps;
    }
}
