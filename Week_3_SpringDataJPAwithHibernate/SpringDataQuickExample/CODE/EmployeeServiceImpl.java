package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employeeList = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong();

    @Override
    public Employee saveEmployee(Employee employee) {
        employee.setId(idCounter.incrementAndGet());
        employeeList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}

