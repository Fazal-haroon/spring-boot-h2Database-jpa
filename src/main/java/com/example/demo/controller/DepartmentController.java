package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.Impl.DepartmentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {
    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
    private final DepartmentService departmentService;
    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/department")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("successfull created");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<Department> fetchDepartmentList(){
        return departmentService.getAllDepartment();
    }

    @GetMapping("/department/{id}")
    public Department fetchDepartmentById(@PathVariable("id") long id) throws DepartmentNotFoundException {
        return departmentService.getById(id);
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartment(@PathVariable("id") long id){
        departmentService.deleteDepartment(id);
        return "Department deleted Successfully!!";
    }

    @PutMapping("/department/{id}")
    public Department updateDepartment(@PathVariable("id") long id, @RequestBody Department department){
        return departmentService.updateDepartment(id, department);
    }

    @GetMapping("/department/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.getDepartmentByName(departmentName);
    }

    @GetMapping("/department/IgnoreCase/{name}")
    public Department fetchDepartmentByNameIgnoreCase(@PathVariable("name") String departmentName){
        return departmentService.getDepartmentByNameIgnoreCase(departmentName);
    }


}
