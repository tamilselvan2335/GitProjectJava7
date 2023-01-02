package com.example.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee.model.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Integer>{

}
