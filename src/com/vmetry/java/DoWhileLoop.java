package com.vmetry.java;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, i = 1;
		do {
			sum += i;
			i++;
			System.out.println(i);

		} while (i <= 5);
		System.out.println("Sum:" + sum);

	}

}
