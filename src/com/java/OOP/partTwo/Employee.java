package com.java.OOP.partTwo;

public class Employee {
	
	int empId;
	String empName;
	String empRole;
	boolean isActive;
	
	public Employee(int empId, String empName, String empRole, boolean isActive) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
		this.isActive = isActive;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	

}
