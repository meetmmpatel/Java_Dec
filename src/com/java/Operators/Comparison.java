package com.java.Operators;

public class Comparison {

	// six relational operators in Java: ==, !=, >, <, >=, <=

	public static void main(String[] args) {

		float f1 = 12.99f;
		float f2 = 10.99f;

		/**
		 * if(condition is true){ run this code }else{ run this code }
		 */

		if (f1 == f2) {
			System.out.println("Both float value are equal");
		} else {
			System.out.println("Both values are not equal");
		}

		if (f1 != f2) {
			System.out.println("Both float value are equal");
		} else {
			System.out.println("Both values are not equal");
		}

		if ((f1 != f2) && (f1 == f2)) {
			System.out.println("Both float value are equal");
		} else {
			System.out.println("Both values are not equal");
		}

	}

}
