package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
  @Autowired
  private EmployeeService employeeService;

  @PostMapping
  public Employee createEmployee(@RequestBody Employee employee) {
    return employeeService.saveEmployee(employee);
  }

  @GetMapping
  public List<Employee> getAllEmployees() {
    return employeeService.getAllEmployees();
  }

}
