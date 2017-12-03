package com.vmetry.java;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d;
		a = 5;
		b = 6;
		c = (a > b) ? a : b;
		d= ((a+b) >c) ? (a+b):c;
		System.out.println("Maximum:" + c);
		System.out.println("Addition Maximum:" + d);
	}

}
