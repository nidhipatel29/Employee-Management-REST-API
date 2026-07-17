package com.SpringRestCrud.cruddemo.RestAPI;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SpringRestCrud.cruddemo.Entity.Employee;
import com.SpringRestCrud.cruddemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;






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

    @GetMapping("/employee/{empId}")

    public Employee getEmpById(@PathVariable int empId){
         Employee employee=employeeService.findById(empId);
         return employee;
    }

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee){
    employee.setId(0);
    Employee dbEmployee =employeeService.save(employee);
    return dbEmployee;

    }  

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee updateEmp=employeeService.save(employee);
        return updateEmp;
    }
    
}
