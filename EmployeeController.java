package com.example.demoforme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demoforme.entity.Employee;
import com.example.demoforme.repository.EmployeeRepository;

import java.util.List;

@RestController
@RequestMapping("/employees") // This maps the controller to /employees
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping // This maps to GET /employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/byProjectCode/{projectCode}") // This maps to GET /employees/byProjectCode/{projectCode}
    public List<Employee> getEmployeesByProjectCode(@PathVariable String projectCode) {
        return employeeRepository.findByProjectCode(projectCode);
    }
}