package com.SpringRestCrud.cruddemo.Service;

import java.util.List;

import com.SpringRestCrud.cruddemo.Entity.Employee;

public interface EmployeeService {

    public List<Employee> findAll();

     Employee findById(int id);

     Employee save(Employee employee);

     void deleteById(int id);
    
} 
