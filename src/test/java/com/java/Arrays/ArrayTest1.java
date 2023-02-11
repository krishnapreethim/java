package com.java.Arrays;

public class ArrayTest1 {
	
	public void cities() {
		String[] cities=new String[3];
		cities[0]="NewYork";
		cities[1]="London";
		cities[2]="Melbourne";
		for(String city:cities) {
			System.out.println(city);
		}
	}
	public static void movies() {
		String[] movies = new String[3];
		movies[0]="RRR";
		movies[1]="KGF";
		movies[2]="BlackPanther";
		System.out.println("Selected movie is::"+movies[2]);
	}
public static void main(String[] args) {
	movies();
	ArrayTest1 test=new ArrayTest1();
	test.cities();
}
}
