package com.java.Arrays;

import java.util.ArrayList;

public class ArraysList2 {
	/*ArrayList in Java is used to store dynamically sized collection of elements. Contrary to Arrays that are fixed in size, an ArrayList grows its size automatically 
	when new elements are added to it*/

	public static void main(String[] args) {
		ArrayList<Object> movies= new ArrayList<Object>();
		movies.add("Seetha");
		movies.add("Ramayanam");
		movies.add("2022");
		System.out.print(movies);
	}
}
