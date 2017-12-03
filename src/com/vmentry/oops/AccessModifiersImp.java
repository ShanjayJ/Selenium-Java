package com.vmentry.oops;

public class AccessModifiersImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers b1, b2, b3;
		b1 = new AccessModifiers("Shanjay", "MALE", 25, 30000.00f, false);// Instanciation
		b1.displayData();

		b2 = new AccessModifiers("SANKI MONKEY", "MALE", 265, 32000.00f, true);// Instanciation

		b2.displayData();

		b3 = new AccessModifiers("APR", "MALE", 265, 38000.50f, false);// Instanciation
		b3.displayData();

	}

}
