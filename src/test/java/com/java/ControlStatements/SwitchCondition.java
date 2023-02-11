package com.java.ControlStatements;

public class SwitchCondition {
	public static void main(String[] args) {
		int busnumber = 10;
		switch (busnumber) {
		case 20:
			System.out.println("Frome Hitech city to sec");
			break;
		case 10:
			System.out.println("From KPHB to sec");
			break;
		case 30:
			System.out.println("Frome jbtu city to Nagole");
			break;
		case 40:
			System.out.println("From Miyapur city to Lakdikapool");
			break;
		default:
			System.out.println("Entered invalid bus number");
			break;
		}
	}

}
