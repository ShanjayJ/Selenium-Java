package com.vmentry.oops;

public class MethodOverloading {
	int  sumi;
	float sumf;

	public int sum(int x, int y) {
		sumi = x + y;
		return sumi;

	}

	public float sum(float a, float b) {
		sumf = a + b;
		return sumf;
	}

}
