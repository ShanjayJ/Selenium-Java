package com.vmetry.exceptions;

public class ThrowExceptions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "123", "456", null, "x37", "789", "abc" };
		for (int i = 0; i < str.length; i++) {
			try {
				sumStrLenAndNum(str[i]);
			} catch (NullPointerException e) {
				// TODO: handle exception
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		}

	}

	public static void sumStrLenAndNum(String val) throws NullPointerException, NumberFormatException {
		int x;
		x = val.length() + Integer.parseInt(val);
		System.out.println(" Sum Conversion of String to Numeric:" + x);

	}

}
