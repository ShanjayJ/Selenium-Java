package com.vmentry.oops;

public class InterfaceArea implements InterfaceRect {

	@Override
	public float areaCircle(float rad) {
		float area;
		area = pi * (rad * rad);
		return area;
	}

	@Override
	public float volumeCone(float rad, int h) {
		float vol;
		vol = pi * (rad * rad) * h;
		return vol;
	}

	@Override
	public float areaRect(int len, int wid) {
		float area;
		area = len * wid;
		return area;

	}

	@Override
	public void displayArea(String type, float area) {
		System.out.println("Area or Volume of " + type + "is:" + area);

	}

}
