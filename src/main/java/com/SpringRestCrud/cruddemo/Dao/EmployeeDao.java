package com.SpringRestCrud.cruddemo.Dao;

import java.util.List;

import com.SpringRestCrud.cruddemo.Entity.Employee;

public interface EmployeeDao {
    
    public List<Employee> findAll();
}
