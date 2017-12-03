package com.vmentry.oops;

public class ThisProfessionalBase {
	String org, desg;

	public ThisProfessionalBase(String org, String desg) {
		this.org = org;
		this.desg = desg;
	}

	public void displayProfessionalDetails() {
		System.out.println("Organisation:" + org);
		System.out.println("Designation:" + desg);

	}

}
