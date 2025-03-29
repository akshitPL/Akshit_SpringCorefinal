 package com.springcore.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Employee {
    private int id;
    private String name;
    private String gender;
    private int salary; // ✅ Ensure this exists

    @Autowired 
    private Address address;
    
  public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Employee(int id, String name, String gender, int salary, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.salary = salary;
	this.address = address;
}




	// Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public int getSalary() { return salary; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setGender(String gender) { this.gender = gender; }
    public void setSalary(int salary) { this.salary = salary; }

    public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", address="
				+ address + "]";
	}




	
}
