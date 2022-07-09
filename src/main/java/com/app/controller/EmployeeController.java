package com.app.controller;

import com.app.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.repository.EmployeeRepository;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    //Get all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployess(){
        return employeeRepository.findAll();
    }
}
