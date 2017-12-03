package com.vmetry.java;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		boolean grt, lss, gtEql, lsEql, eql, ntEql;
		a = 5;
		b = 6;
		grt = (a > b);
		lss = (a < b);
		gtEql = (a >= b);
		lsEql = (a <= b);
		eql = (a == b);
		ntEql = (a != b);
		System.out.println("Greater Than:" + grt);
		System.out.println("Lesser Than:" + lss);
		System.out.println("Greater Than or Equal:" + gtEql);
		System.out.println("Lesser Than or Equal:" + lsEql);
		System.out.println("Equal to:" + eql);
		System.out.println("Not Equal to:" + ntEql);

	}

}
