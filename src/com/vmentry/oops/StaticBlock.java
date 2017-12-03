package com.vmentry.oops;

public class StaticBlock {

	static String institue;
	String name;

	static {
		institue = "Vmetry";
		System.out.println("Institute:" + institue);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("It can be executed now. But the main Method() will execute only after the static class");

	}

}
