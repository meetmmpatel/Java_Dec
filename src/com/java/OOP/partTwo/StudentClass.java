package com.java.OOP.partTwo;

public class StudentClass {
	int rollNum;
	String studentName;
	Add studentAddress;

	public StudentClass(int rollNum, String name, Add address) {
		this.rollNum = rollNum;
		this.studentName = name;
		this.studentAddress = address;

	}

	public static void main(String[] args) {
		Add address = new Add(120, "Falls Church", "VA", "USA");

		StudentClass student = new StudentClass(10, "Mike", address);

		System.out.println(student.rollNum);
		System.out.println(student.studentName);
		System.out.println(student.studentAddress.streetNum);
		System.out.println(student.studentAddress.city);

	}

}

class Add {

	int streetNum;
	String city;
	String state;
	String country;

	public Add(int streeNum, String c, String s, String country) {
		this.streetNum = streeNum;
		this.city = c;
		this.state = s;
		this.country = country;

	}

	

}
