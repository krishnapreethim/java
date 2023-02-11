package com.java.Basic;

public class InstanceMethod1 {
	public void addition(int a, int b) {
		int c= a+b;
		System.out.println("Addition of two numbers is ::"+c);
	}
	public static void subtraction(int a, int b) {
		int c= a-b;
		System.out.println("subtraction of two numbers is ::"+c);
	}
	public static void main(String[] args) {
		InstanceMethod1 ref= new InstanceMethod1();
		ref.addition(100, 50);// method parameters 
		subtraction(200, 100);
	}

}
