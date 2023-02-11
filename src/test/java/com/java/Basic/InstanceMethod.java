package com.java.Basic;

public class InstanceMethod {
	/*1.Methods is nothing but functions in Java. Where we are going to write out bussines logis
	 * 2. Methods is the location where we are going to write our business logics
	 * Question
	 * How many typs of method in Java?
	 * Instance Methods 
	 * Static Method 
	 * 
	 *  Instance Methods :- A method which is declared inside class without static keyword in 
	 *  Instance Methods 
	 *  
	 *  Static Method :- A method which is declared inside class with static Keyword is called static method 
	 * 
	 *  Sytax for Method 
	 *  [AccessModifier][ReturnType][MethodName](){
	 *  Here we are going to write method body.
	 */
	int a=10; // globl variable
	static int b=20; // static variable
	
	public void addition() {
		int a = 10; // Local variable
		int b = 20; // Local variable
		int c = a+b; 
		System.out.println("Addition of two numbers is ::"+c);
	}// Here memory not allocated
	
	public static void subtraction() {
		int a= 50;
		int b= 20;
		int c= a-b;
		System.out.println("subraction of two numbers is"+c);
	} // memory is allocated due to static kay word
	public static void main(String[] args) {
		int c= 30;// local variable
		System.out.println(b); // Static Key word 
		
		// Object creation foe non static key word 
		// [ClaseName] ref = new [ClassName]();
		InstanceMethod ref=new InstanceMethod();
		ref.addition();
		System.out.println(ref.a);
		subtraction();
		
	}

}
