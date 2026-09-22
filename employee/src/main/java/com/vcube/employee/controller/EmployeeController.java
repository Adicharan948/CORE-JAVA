package com.vcube.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.employee.model.Employee;
import com.vcube.employee.repository.EmployeeRepository;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:5173")
public class EmployeeController {

    private EmployeeRepository repository;

    // Constructor
    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    // ADD EMPLOYEE
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {

        Employee savedEmployee = repository.save(employee);

        System.out.println("Employee Added:");
        System.out.println(savedEmployee);

        return savedEmployee;
    }

    // GET ALL EMPLOYEES
    @GetMapping
    public List<Employee> getAllEmployees() {

        List<Employee> employees = repository.findAll();

        System.out.println("All Employees:");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        return employees;
    }

    // UPDATE EMPLOYEE
    @PutMapping("/{id}")
    public Employee updateEmployee(
            @PathVariable Integer id,
            @RequestBody Employee employee) {

        Employee existingEmployee =
                repository.findById(id).orElse(null);

        if (existingEmployee == null) {
            return null;
        }

        existingEmployee.setName(employee.getName());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setSalary(employee.getSalary());

        Employee updatedEmployee =
                repository.save(existingEmployee);

        System.out.println("Employee Updated:");
        System.out.println(updatedEmployee);

        return updatedEmployee;
    }

    // DELETE EMPLOYEE
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Integer id) {

        if (!repository.existsById(id)) {
            return "Employee not found";
        }

        repository.deleteById(id);

        System.out.println("Employee Deleted: " + id);

        return "Employee deleted successfully";
    }
}