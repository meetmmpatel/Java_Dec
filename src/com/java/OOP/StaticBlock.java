package com.java.OOP;

public class StaticBlock {
	
	static int num;
	static String myStr;
	
	
	static {
		System.out.println("static block One");
		num = 78;
		myStr = "Static Keyword";
	}
	
	static void disp() {
		System.out.println("static block Two");
		num = 90;
		myStr = "My Static Keyword";
		System.out.println(num);
		System.out.println(myStr);
	}
	
	public static void main(String[] args) {
		disp();
		
	}
	
	

}
