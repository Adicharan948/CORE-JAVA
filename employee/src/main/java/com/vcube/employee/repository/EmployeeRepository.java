package com.vcube.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}