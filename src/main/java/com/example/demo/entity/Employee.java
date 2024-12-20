package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity
@Table(name="employees")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private String emailID;
	
	public Employee(long id, String firstName, String lastName, String emailID) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	
	
}
