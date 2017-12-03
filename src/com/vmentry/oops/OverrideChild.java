package com.vmentry.oops;

public class OverrideChild extends OverrideParent {
	private String addr;
	public final String org ="Vmetry";
	protected String workingloc;

	public OverrideChild(String iName, int iAge, float iSal, boolean iIsMarried, String address,
			String workinglocation) {
		super(iName, iAge, iSal, iIsMarried);
		addr = address;
		workingloc = workinglocation;
	}

	public void displayData() {
		System.out.println("Organization:" +org);
		System.out.println("Living Address:" + addr);
		System.out.println("working Location:" + workingloc);
	}


}
