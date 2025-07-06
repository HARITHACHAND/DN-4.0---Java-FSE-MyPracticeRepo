package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.model.Employee;
import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
}

