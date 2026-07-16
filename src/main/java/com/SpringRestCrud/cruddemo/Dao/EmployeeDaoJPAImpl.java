package com.SpringRestCrud.cruddemo.Dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringRestCrud.cruddemo.Entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;


@Repository
public class EmployeeDaoJPAImpl implements EmployeeDao{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
    TypedQuery<Employee> query = entityManager.createQuery("FROM Employee",Employee.class);
        List<Employee> employees=query.getResultList();
        return employees;
    }  

     public Employee findById(int id){
          
        Employee employee=entityManager.find(Employee.class, id);
        return employee;

     }

     public Employee save(Employee employee){
        Employee dbEmployee=entityManager.merge(employee);
        return dbEmployee;
     }
    

     public void deleteById(int id){
       Employee tempemployee=entityManager.find(Employee.class, id);
       entityManager.remove(tempemployee);
     }


    
    
}
