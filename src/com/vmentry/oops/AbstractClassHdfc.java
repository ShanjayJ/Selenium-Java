package com.vmentry.oops;

public class AbstractClassHdfc extends AbstractClassRD {
	private float rdlimit; // as we are using the rdlimit in this class only we are defining it in this
							// class instead of Abstract class

	@Override
	protected float setRDLimit() {
		rdlimit = 7.5f;
		// TODO Auto-generated method stub
		return rdlimit;
	}

}
