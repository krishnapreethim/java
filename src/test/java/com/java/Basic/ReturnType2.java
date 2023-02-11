package com.java.Basic;

public class ReturnType2 {
	public void addition(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two numbers is ::" + c);
	}

	public static void sub(int a, int b) {
		int c = a - b;
		System.out.println("Addition of two numbers is ::" + c);
	}

	public int multiplaction() {
		int a = 10;
		int b = 20;
		int c = a * b;
		return c;

	}

	public static String name() {
		String name = "pandu";
		return name;
	}

	public static void main(String[] args) {
		ReturnType2 ref = new ReturnType2();
		ref.addition(20, 30);

		sub(20, 10);
		System.out.println(ref.multiplaction());
		System.out.println(name());
	}

}
