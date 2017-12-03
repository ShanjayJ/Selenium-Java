package com.vmetry.test;

import java.util.Scanner;

public class ArithmeticOperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, sum, diff, mul, div, modu;
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Value of A");
		a = inputReader.nextInt();
		System.out.println("Enter the Value of B");
		b = inputReader.nextInt();
		sum = a + b;
		diff = a - b;
		mul = a * b;
		div = a / b;
		modu = a % b;
		System.out.println("The sum of the values is:" + sum);
		System.out.println("The difference between values is:" + diff);
		System.out.println("The Multpication of the values is:" + mul);
		System.out.println("The division of the values is:" + div);
		System.out.println("The Modulus of the values is:" + modu);

	}

}
