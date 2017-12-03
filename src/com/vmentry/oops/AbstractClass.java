package com.vmentry.oops;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float hdfcRDLimit;
		AbstractClassHdfc hdfc = new AbstractClassHdfc();//object can only be created for NON abstract method
		hdfcRDLimit = hdfc.setRDLimit(); // setRDLimit is a Abstract method
		hdfc.displayRDLimit(hdfcRDLimit); // displayRDLimit is a non-abstract method

	}

}
