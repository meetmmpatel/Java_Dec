package com.java.Operators;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		int numOne;
		int numTwo;
		int numThree;

		Scanner scan = new Scanner(System.in);
		System.out.println("enter numOne");
		numOne = scan.nextInt();

		System.out.println("enter numTwo");
		numTwo = scan.nextInt();

		System.out.println("enter numThree");
		numThree = scan.nextInt();

		int temp = (numOne > numTwo) ? numOne : numTwo;
		int result = (numThree > temp) ? numThree : temp;
		System.out.println("largest Value: " + result);

	}

}
