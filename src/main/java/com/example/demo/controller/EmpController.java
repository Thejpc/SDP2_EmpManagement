package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmpController {
    @Autowired
	private EmployeeService empser;
	
	  //api
	@GetMapping("/getMessage")
	public String getMessage()
	{
		return "Welcome to SDP";
	}
	
	@PostMapping("/registerEmployee")
	public Employee saveEmployee(@RequestBody Employee emp)
	{
		Employee emp1=empser.registerEmployee(emp);
		return emp;
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees()
	{
		List<Employee> allEmployee=empser.getAllEmployee();
		return allEmployee;
	}
	
	@GetMapping("/getById/{id}")
	public Employee getByEmpId(@PathVariable long id)
	{
		Employee empl=empser.getByEmpId(id);
		return empl;
	}
	
	@DeleteMapping("/deleteById/{id}")
	public String deleteEmployeeById(@PathVariable long id)
	{
		String result=empser.deleteEmployeeById(id);
		return result;
	}
	
	@PutMapping("/updateEmployee")
	public Employee updateEmplById(@RequestBody Employee employee)
	{
		Employee ee=empser.updateEmpById(employee);
		return ee;
	}
}
