package com.SpringRestCrud.cruddemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRestCrud.cruddemo.Dao.EmployeeDao;
import com.SpringRestCrud.cruddemo.Entity.Employee;

import jakarta.transaction.Transactional;

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

    public Employee findById(int id){
        Employee employee=employeeDao.findById(id);
        if(employee==null){
         throw new RuntimeException("employee id not found");
        }
        return employeeDao.findById(id);
     }

     @Transactional
    public Employee save(Employee employee){

        return employeeDao.save(employee);
    }

    @Transactional
    public void deleteById(int id){
       employeeDao.deleteById(id);
    }
    
}
