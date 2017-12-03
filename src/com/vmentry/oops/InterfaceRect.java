package com.vmentry.oops;

import com.vmetry.test.InterfaceCircle;

public interface InterfaceRect extends InterfaceCircle, InterfaceCone {
	float areaRect(int len, int wid);

	public void displayArea(String type, float area);

}
