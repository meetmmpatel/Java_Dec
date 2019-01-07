package com.java.OOP.partTwo;

public class Manager extends Employee {
	
	boolean isPerform;
	String teamManagement;
	
	
	public Manager(int empId, String empName, String empRole, boolean isActive, boolean isPerform,
			String teamManagement) {
		super(empId, empName, empRole, isActive);
		this.isPerform = isPerform;
		this.teamManagement = teamManagement;
	}
	
	public static void main(String[] args) {
		Manager managerOne = new Manager(12, "Jack", "Manager", true, true, "One team");
		
		System.out.println(managerOne);
		System.out.println(managerOne.isPerform);
		System.out.println(managerOne.teamManagement);
		
		Manager managerTwo = new Manager(13, "Jim", "Manager", true, true, "Two team");
		System.out.println(managerTwo);
	}

	
	
	

}
