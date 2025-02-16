package com.example.department.controller;

import com.example.department.model.Department;
import com.example.department.service.DepartmentService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

  @Autowired
  private DepartmentService departmentService;

  @PostMapping
  public Department createDepartment(@RequestBody Department department) {
    return departmentService.saveDepartment(department);
  }

  @GetMapping
  public List<Department> getAllDepartments() {
    return departmentService.getAllDepartments();
  }
}
