package com.SpringRestCrud.cruddemo.RestAPI;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SpringRestCrud.cruddemo.Entity.Employee;
import com.SpringRestCrud.cruddemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")
public class EmployeeRestContoller {
    
    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestContoller(EmployeeService thEmployeeService) {
        this.employeeService = thEmployeeService;
    }

    @GetMapping("/employee") 
    public List<Employee> findAll(){
        return employeeService.findAll(); 
    }
    
}
