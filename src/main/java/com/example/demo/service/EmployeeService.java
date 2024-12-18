package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository emprepo;
	
	public Employee registerEmployee(Employee emp)
	{
		Employee e1=emprepo.save(emp);
		return e1;
	}
	
	public List<Employee> getAllEmployee(){
		List<Employee> allEmployee=emprepo.findAll();
		return allEmployee;
		
	}
	public Employee getByEmpId(long id)
	{
		Employee emp3=emprepo.getById(id);
		return emp3;
	}
	public String deleteEmployeeById(long id)
	{
		try {
			emprepo.deleteById(id);
			return " employee is deleted successfully";
		}
		catch (Exception e){
			return "employee is not deleted ";
		}
	}
	
	public Employee updateEmpById(Employee employee)
	{
		Employee employ=emprepo.getById(employee.getId());
		employ.setFirstName(employee.getFirstName());
		employ.setEmailID(employee.getEmailID());
		employ.setLastName(employee.getLastName());
		Employee emplo2=emprepo.save(employ);
		return emplo2;
	}
}
