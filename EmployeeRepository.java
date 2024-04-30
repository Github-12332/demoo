package com.example.demoforme.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoforme.entity.Employee;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAll();
    List<Employee> findByProjectCode(String projectCode);
}
