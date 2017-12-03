package com.vmetry.exceptions;

public class UncheckedExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dshjhmhngf";
		String str1 = null;
		System.out.println("DataBase Opened");
		try {
			System.out.println("String Length:" + str1.length());
		} finally {
			System.out.println("Database Closed");
		}
	}

}
