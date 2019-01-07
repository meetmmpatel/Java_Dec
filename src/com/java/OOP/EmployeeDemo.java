package com.java.OOP;

public class EmployeeDemo {
	
	int empId;
	String empName;
	
	
	public EmployeeDemo(int empId, String empName) {
		
		this.empId = empId;
		this.empName = empName;
	}


	@Override
	public String toString() {
		return "EmployeeDemo [empId=" + empId + ", empName=" + empName + "]";
	}
	
	public static void main(String[] args) {
		
		EmployeeDemo empOne = new EmployeeDemo(10010, "Mike Smith");
		EmployeeDemo empTwo = new EmployeeDemo(10011, "Jack Rayan");
		
		System.out.println(empOne);
		System.out.println(empTwo);
	}
	
	
	
	

}
