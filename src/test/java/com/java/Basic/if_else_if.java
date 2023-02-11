package com.java.Basic;

public class if_else_if {
	public void eligibleForJob() {
		String graduation="MBA";
		if(graduation.equals("Btech"))
		{
			System.out.println("Eligible for IT job ");
		}
		else if(graduation.equals("Bsc")) {
			System.out.println("Eligible for associate professor");
		}
		else if(graduation.equals("MBA")) {
			System.out.println("eligible for Fainance or Markating ");
		}
		else
		{
			System.out.println("not eligible for professer jpb..!");
		}
		
	}
	public static void main(String[] args) {

		if_else_if ref=new if_else_if();
		ref.eligibleForJob();
	}

}
