package com.vmentry.oops;

public class InheritanceChild extends InheritanceParent {
	private String addr;
	protected String workingloc;

	public InheritanceChild(String iName, int iAge, float iSal, boolean iIsMarried, String address,
			String workinglocation) {
		super(iName, iAge, iSal, iIsMarried);
		addr = address;
		workingloc = workinglocation;
	}

	public void displayChlidData() {
		displayParentData();
		System.out.println("Living Address:" + addr);
		System.out.println("working Location:" + workingloc);
	}

}
