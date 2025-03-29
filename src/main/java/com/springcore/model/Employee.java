 package com.springcore.model;

public class Employee {
    private int id;
    private String name;
    private String gender;
    private int salary; // ✅ Ensure this exists

    
    
    
  public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


public Employee(int id, String name, String gender, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
    }
}
