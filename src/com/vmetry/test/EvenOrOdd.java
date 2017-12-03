package com.vmetry.test;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = S1.nextInt();
		if (num % 2 == 0) {
			System.out.println("It is a EVEN number");
		} else {
			System.out.println("It is a ODD number");
		}

	}

}
