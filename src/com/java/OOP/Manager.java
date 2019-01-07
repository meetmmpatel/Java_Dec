package com.java.OOP;

public class Manager extends Employee {

	public Manager(Long id, String firstName, String lastName) {
		super(id, firstName, lastName);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Manager manager = new Manager(120L, "Nick", "Falls");
		System.out.println(manager);
		
		
	}

}

class Employee {
	Long id;
	String firstName;
	String lastName;

	public Employee(Long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
