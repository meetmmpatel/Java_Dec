package com.java.OOP.partThree;

public class SumOfAll {
	
	public int add(int numOne, int numTwo) {
		return numOne + numTwo;
	}

	public static String add(int numOne, String str){
		return null;
	}


	
	public String add(String strOne , String strTwo) {
		return strOne + strTwo;
	}
	
	
	public int add(int numOne, int numTwo, int numThree) {
		return numOne + numTwo + numThree;
	}
	
	public int add(int numOne, int numTwo, int numThree, int four) {
		return numOne + numTwo + numThree + four;
	}
	
	public static void main(String[] args) {
		
		SumOfAll obj = new SumOfAll();
		System.out.println(obj.add(12, 23,78));
		System.out.println(obj.add("Test", "One"));
		
	}
	
	

}
