package com.java.loops;

import java.util.Scanner;

public class ForLoopDemo {

	// 1 to 10;

	/**
	 * for(initalization; condition: increment/derement){ statement: }
	 * 
	 */

	public static void main(String[] args) {

//		for (int i = 10; i >= 0; i--) {
//			System.out.println(i);
//		}
//
//		for (int j = 0; j <= 10; j++) {
//			System.out.println(j);
//		}

		int num;
		int sum = 0;
		double avg;

		System.out.println("Please enter 5 numbers");
		for (int i = 1; i < 5; i++) {

			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();

			sum += num;

		}
		avg = sum/5;
		System.out.println("The sum of 5 numbers are" + sum);
		System.out.println("The avg of 5 numbers are" + avg);

	}

	// Write a program in Java to input 5 numbers from keyboard and find their sum
	// and average.

}
