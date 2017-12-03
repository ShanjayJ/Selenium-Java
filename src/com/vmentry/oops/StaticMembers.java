package com.vmentry.oops;

public class StaticMembers {
	static float pi;

	public static float findArea(float rad) {
		float area;
		area = pi * (rad * rad);
		return area;
	}

	public void displayArea(float area) {
		System.out.println("Area of Circle:" + area);

	}

}
