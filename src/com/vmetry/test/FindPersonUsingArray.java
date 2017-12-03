package com.vmetry.test;

import java.util.Scanner;

public class FindPersonUsingArray {

	public static void main(String[] args) {
		boolean presence = false;
		// TODO Auto-generated method stub

		String a[] = { "aaa", "bbb", "ccc" };
		for (int i = 0; i < a.length; i++) {
			if (a[i].equalsIgnoreCase("XXX")) {
				presence = true;
				break;
			}
		}

		if (presence == true) {
			System.out.println("Person Exists in the account");
		} else {
			System.out.println("This person not present.");
		}

	}
}
