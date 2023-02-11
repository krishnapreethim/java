package com.java.Arrays;

/*The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array,
you have to create a new one)*/

public class Array {
	public static void main(String[] args) {
		String[] movies= new String[4];
		movies[0]="Krishna";
		movies[1]="Preethi";
		movies[2]="Chinni";
		movies[3]="Seshu";
		//System.out.println(movies[2]);
		
		//System.out.println(movies[0]);
		
		
		for(int i=1;i<=movies.length;i++) {
		System.out.println(movies[i]);
	}
	}
	

}
