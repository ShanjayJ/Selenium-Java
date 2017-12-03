package com.vmetry.exceptions;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "123", "456", null, "x37", "789", "abc" };
		int x;

		for (int i = 0; i < str.length; i++) {
			try {
				x = str[i].length() + Integer.parseInt(str[i]);
				System.out.println(" Sum Conversion of String to Numeric:" + x);
			} catch (NumberFormatException e) {
				// System.out.println(e.getmessage());
			} catch (NullPointerException e) {
			} catch (Exception e) {
			}
		}
	}
}
