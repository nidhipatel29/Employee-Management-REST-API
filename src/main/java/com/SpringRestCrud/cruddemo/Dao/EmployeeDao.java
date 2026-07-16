package com.SpringRestCrud.cruddemo.Dao;

import java.util.List;

import com.SpringRestCrud.cruddemo.Entity.Employee;

public interface EmployeeDao {
    
     List<Employee> findAll();

     Employee findById(int id);

     Employee save(Employee employee);

     void deleteById(int id);


}
