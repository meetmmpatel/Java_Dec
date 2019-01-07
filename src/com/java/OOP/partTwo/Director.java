package com.java.OOP.partTwo;

public class Director extends Employee {
	
	boolean managingTeams;
	String department;
	
	
	public Director(int empId, String empName, String empRole, boolean isActive, boolean managingTeams,
			String department) {
		super(empId, empName, empRole, isActive);
		this.managingTeams = managingTeams;
		this.department = department;
	}
	
	public static void main(String[] args) {
		
		Director directorOne = new Director(110, "Mike", "director", true, true, "Tech");
		System.out.println(directorOne.managingTeams);
		System.out.println(directorOne.department);
	}
	
	

}
