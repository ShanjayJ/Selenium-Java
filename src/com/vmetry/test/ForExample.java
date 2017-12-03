package com.vmetry.test;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Value of i");
		i = inputReader.nextInt();
		for (; i <= 100; i++) {
			System.out.println(i);
		}
	}

}
