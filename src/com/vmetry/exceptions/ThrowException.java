package com.vmetry.exceptions;

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "123", "456", null, "x37", "789", "abc" };
		try {
			sumStrLenAndNum(str);
		} catch (InvalidInputException e) {
			// TODO: handle exception
			System.out.println("Exception Message:" + e.getMessage());
			System.out.println("Exception Class:" + e.getClass().getName());
		}

	}

	public static void sumStrLenAndNum(String[] input) throws InvalidInputException {
		int x;
		for (int i = 0; i < input.length; i++) {
			try {
				x = input[i].length() + Integer.parseInt(input[i]);
				System.out.println(" Sum Conversion of String to Numeric:" + x);
			} catch (Exception e) {
				throw new InvalidInputException("User Provided Invalid Input" + input[i]);
			}
		}
	}
}
