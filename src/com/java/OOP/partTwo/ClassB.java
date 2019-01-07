package com.java.OOP.partTwo;

public class ClassB extends ClassA {



	public static void main(String[] args) {

		ClassB obj = new ClassB();
		
		System.out.println(obj.id = 12);
		System.out.println(obj.name = "Mike Smith");
		System.out.println(obj.streetNo = 120);
		System.out.println(obj.streetName = "Main St" + "StreetName: ");
		System.out.println(obj.zipCode = 22042);
		System.out.println(obj);

	}

}

class ClassA extends Address {

	int id;
	String name;
	Address address;

	

	public ClassA() {
		super();
	}

	public ClassA(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ClassA(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "ClassA [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	

}

class Address {
	int streetNo;
	String streetName;
	String cityName;
	int zipCode;
	
	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", streetName=" + streetName + ", cityName=" + cityName + ", zipCode="
				+ zipCode + "]";
	}

	
}
