package com.vmetry.java;

public class MethodsReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0;
		n = 15;

		doReverse(n);
		doReverse(5);
		doReverse(7);

		sum = getSum(n);
		displaySum(sum, n);
		sum = getSum(2);
		displaySum(sum, 2);
		sum = getSum(8);
		displaySum(sum, 8);

	}

	public static void doReverse(int x) {
		for (int i = x; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println();
	}

	public static int getSum(int x) {
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum += i;

		}
		return sum;

	}

	public static void displaySum(int sum, int x) {
		System.out.println("sum of " + x + ":" + sum);

	}
}
