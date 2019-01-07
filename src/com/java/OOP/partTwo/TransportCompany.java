package com.java.OOP.partTwo;

public class TransportCompany extends Driver {

	public TransportCompany(String name, String carName, int carId) {
		super(name, carName, carId);

	}

	// Andy is a driver of car Id: 9988

	static int numOne = 110;

	public static void main(String[] args) {
		Driver driver = new Driver("Andy", "Ford", 9988);
		System.out.println(driver.driverName + " is a driver of car Id " + driver.carId);
		System.out.println(numOne);

		TransportCompany obj = new TransportCompany("Somename", "ford", 1234);
		obj.printNumber();

	}

	void printNumber() {
		System.out.println(super.numOne);
	}

}

class Driver extends CarClass {

	String driverName;

	int numOne = 100;

	public Driver(String name, String carName, int carId) {
		super(carName, carId);
		this.driverName = name;

	}

}

class CarClass {
	String carName;
	int carId;

	public CarClass(String name, int id) {
		this.carName = name;
		this.carId = id;

	}

}
