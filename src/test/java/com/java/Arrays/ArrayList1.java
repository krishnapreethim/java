package com.java.Arrays;

import java.util.ArrayList;

public class ArrayList1 {
	//ArrayList ref=new ArrayList(); My array size is 10[default size]
	public static void main(String[] args) {
		ArrayList<Object> student = new ArrayList<Object>();
		student.add("Krishna");
		student.add("100");
		student.add("A");
		student.add("Preethi");
		student.add("101");
		student.add("B");
		student.add("Madiraju");
		student.add("102");
		student.add("c");
		student.add("Gayathri");
		student.add("103");
		student.add("D");
		//System.out.println(student);
		for(Object stnd:student) {
			System.out.println(stnd);
		}
		String [] studentdata = new String[3];
		studentdata[0]="Krishna";
		studentdata[1]="Preethi";
		studentdata[2]="Madiraju";
		//System.out.println(studentdata[1]);
		for(String student1:studentdata) {
			System.out.println(student1);
		}
	}

}
