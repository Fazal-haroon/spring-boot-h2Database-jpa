package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> getAllDepartment();

    public Department getById(long id) throws DepartmentNotFoundException;

    void deleteDepartment(long id);

    Department updateDepartment(long id, Department department);

    Department getDepartmentByName(String departmentName);

    Department getDepartmentByNameIgnoreCase(String departmentName);
}
