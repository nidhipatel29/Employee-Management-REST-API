package com.SpringRestCrud.cruddemo.RestAPI;

import java.util.List;
import java.util.Map;

import javax.management.RuntimeErrorException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SpringRestCrud.cruddemo.Entity.Employee;
import com.SpringRestCrud.cruddemo.Service.EmployeeService;
import tools.jackson.databind.json.JsonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api")
public class EmployeeRestContoller {

    private EmployeeService employeeService;
    private JsonMapper jsonMapper;

    @Autowired
    public EmployeeRestContoller(EmployeeService thEmployeeService, JsonMapper jsonMapper) {
        this.employeeService = thEmployeeService;
        this.jsonMapper = jsonMapper;
    }

    @GetMapping("/employee")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employee/{empId}")

    public Employee getEmpById(@PathVariable int empId) {
        Employee employee = employeeService.findById(empId);
        return employee;
    }

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee) {
        employee.setId(0);
        Employee dbEmployee = employeeService.save(employee);
        return dbEmployee;

    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        Employee updateEmp = employeeService.save(employee);
        return updateEmp;
    }

    @PatchMapping("/employees/{empId}")
    public Employee partialUpdate(@PathVariable int empId,
                                  @RequestBody Map<String, Object> Patchpayload) {
      Employee tempEmployee=employeeService.findById(empId);
      if(tempEmployee==null){
        throw new RuntimeException("employee id not found");
      }
      //throw an exception if request body have id
      if(Patchpayload.containsKey("id")){
        throw new RuntimeException("id is not allowed in request body");
      }
      Employee patchPayload=jsonMapper.updateValue(tempEmployee,Patchpayload);
      Employee dbEmployee=employeeService.save(patchPayload);
        return dbEmployee;
    }

}
