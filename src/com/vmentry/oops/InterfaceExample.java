package com.vmentry.oops;

import java.util.Scanner;

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float area;
		Scanner inputReader = new Scanner(System.in);
		InterfaceArea intf = new InterfaceArea();
		System.out.println("Enter Radius:");
		float rad = inputReader.nextFloat();
		System.out.println("Enter Height:");
		int height = inputReader.nextInt();
		System.out.println("Enter the length and width:");
		int len = inputReader.nextInt();
		int wid = inputReader.nextInt();
		area = intf.areaCircle(rad);
		area = intf.areaCircle(rad);
		intf.displayArea("Circle", area);
		area = intf.volumeCone(rad, height);
		intf.displayArea("Cone", area);
		area = intf.areaRect(len, wid);
		intf.displayArea("Circle", area);

	}

}
