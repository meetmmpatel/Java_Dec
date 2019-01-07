package com.java.dataTypes;

public class DataIntro {
	
	/* Two Types of Data in Java
	 * 1. Primitive Data Types 
	 * 2. Non-Primitive/Refernece Data Types (Class)- String.
	 * 
	 * Primitive Data types
	 * 1. byte 2.short 3.int 4.long
	 * 5. float 6.double 7. char 8.boolean
	 * 
	 * Reference Data types
	 * 1. String, of any Class form Java 
	 * 
	 * 1. byte   -128 to 127 value 
	 * 2. short -32768 to 32768 
	 * 3. int  -2,147,483,648 to 2,147,483,647
	 * 4. long -9,223,372,036,854,775,808 to 9,223_372,036,854,775,807. (9 bllions)
	 * 5. float 19.9999999 it's 7 decimals 12.99f
	 * 6. double 15 decimals 12.9999d;
	 * 7. char = 'a', '$' it can only hold one char and it's single qoute
	 * 8. boolean = true or false
	 */
	
	// create the main method andd print each data with value
	
	public static void main(String[] args) {
		
		long l1 = 956985989999L;
		
		System.out.println(l1);
		
		boolean b1 = true;
		
		char c1 = 'b';
		
		String s1 = "This is string";
		System.out.println(s1);
		
		long max = Long.MAX_VALUE;
		System.out.println(max);
		
		long min = Long.MIN_VALUE;
		System.out.println(min);
		
		int maxInt = Integer.MAX_VALUE;
		System.out.println(maxInt);
		
	}
	
	

}
