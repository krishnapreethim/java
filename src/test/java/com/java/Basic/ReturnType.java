package com.java.Basic;

public class ReturnType {
	/*
	 * After completion of particular functionality we need to return some output
	 * void is the return type, which won't return anything 
	 * public int addition(){
	 * int a=10;
	 * int b=20;
	 * int c=a+b;
	 * return c;
	 * }
	 */
	public void addition (int a, int b) {
		int c= a+b;
		System.out.println("Addition of two numbers is ::"+c);
	}
	public static void subtraction (int a, int b) {
		int c=a-b;
		System.out.println("subtraction of two numbers is ::"+c);
	}
	public int division() {
		int a= 10;
		int b= 20;
		int c= a%b;
		return c;
	}
	public static String studentname() {
		String name="Krishnapreethi";
		return name;
	}
	public static void main(String[] args) {
		ReturnType ref=new ReturnType();
		ref.addition(20, 30);// Method parameters
		subtraction(100, 50);
		System.out.println(ref.division());
		System.out.println(studentname());
		
	}

}
