package com.example.Employee.controller;


import java.util.List;
import java.util.Map;

import com.example.Employee.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.service.EmployeeService;
import com.example.Employee.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/emp/")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService; 
	
	@GetMapping("/show")
	public List<Employees> findAll(){
		return employeeService.findAll();		
	}
	
	@PostMapping("/post")
	public Employees insertEmp(@RequestBody Employees emp) {
		return employeeService.save(emp);		
	}
	
	@GetMapping("/show/{id}")
	public ResponseEntity<Employees> selectEmpById(@PathVariable int id) throws ResourceNotFoundException {
		return employeeService.insertEmp(id);
	}
	
	@PatchMapping("/patch/{id}")
	public ResponseEntity<Employees> updateById(@PathVariable int id, @RequestBody Employees emp) throws ResourceNotFoundException{
		return employeeService.updateById(id, emp);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteByID(@PathVariable int id){
		return employeeService.delete(id);	
	}

}
