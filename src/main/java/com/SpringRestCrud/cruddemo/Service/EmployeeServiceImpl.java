package com.SpringRestCrud.cruddemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRestCrud.cruddemo.Dao.EmployeeDao;
import com.SpringRestCrud.cruddemo.Entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDao employeeDao;
    
    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();

    }
    
}
