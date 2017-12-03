package com.vmetry.java;

import java.util.Scanner;

public class ModificationOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, a, b, c, d;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the inputs");
		i = inputReader.nextInt();
		a = ++i;
		b = i++;
		c = --i;
		d = i--;
		System.out.println("A:" + a);
		System.out.println("B:" + b);
		System.out.println("C:" + c);
		System.out.println("D:" + d);
	
	}

}
