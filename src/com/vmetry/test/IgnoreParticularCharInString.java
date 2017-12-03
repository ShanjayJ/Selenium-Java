package com.vmetry.test;

import java.util.Scanner;

import org.omg.CORBA.StringValueHelper;

public class IgnoreParticularCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String str; char ch; str = "Shanjay"; ch = 'a';
		 * 
		 * String ignore = new StringBuilder(str).deleteCharAt(0).toString();
		 * System.out.println(ignore);
		 */

		String str;
		char ch, s;

		Scanner inputReader = new Scanner(System.in);
		System.out.println("Enter the Text Here:");
		str = inputReader.nextLine();
		System.out.println("Enter the char to ignore");
		s = inputReader.next(".").charAt(0);

		for (int i = 0; i < str.length();) {
			ch = str.charAt(i);
			if (ch == s) {
				i++;
			} else {
				System.out.print(ch);
				i++;
			}
		}
		inputReader.close();
	}
	/*
	 * StringBuilder ignore = new StringBuilder(str).deleteCharAt(pos); // with
	 * string builder we can delete a char in // string System.out.println(ignore);
	 */

}
