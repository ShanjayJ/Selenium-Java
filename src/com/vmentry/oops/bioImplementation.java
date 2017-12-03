package com.vmentry.oops;

public class bioImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bio b1, b2, b3;
		b1 = new bio();// Instanciation
		b1.name = "SHANJAY";
		b1.setData("MALE", 25, 30000.00f, false);
		b1.displayData();

		b2 = new bio();// Instanciation
		b2.name = "SANKI MONKEY";
		b2.setData("MALE", 26, 35000.00f, true);
		b2.displayData();

		b3 = new bio();// Instanciation
		b3.name = "APR";
		b3.setData("MALE", 26, 32000.00f, false);
		b3.displayData();
	}

}
