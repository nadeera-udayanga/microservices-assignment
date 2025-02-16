package com.example.department.service;

import com.example.department.model.Department;
import com.example.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

  @Autowired
  private DepartmentRepository departmentRepository;

  public Department saveDepartment(Department department) {
    return departmentRepository.save(department);
  }

  public List<Department> getAllDepartments() {
    return departmentRepository.findAll();
  }
}
