package com.java.Operators;

public class Logical {
	
	//Logical operators in java are: && (and), ||(Or), !(not)
	
	public static void main(String[] args) {
		
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1 && b2" + (b1 && b2));
		System.out.println("b1 || b2" + (b1 || b2));
		System.out.println("!(b1 && b2)" + !(b1&& b2));
		
	}

}
