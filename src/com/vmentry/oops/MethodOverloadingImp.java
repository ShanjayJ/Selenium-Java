package com.vmentry.oops;

public class MethodOverloadingImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading ovr1, ovr2;
		ovr1 = new MethodOverloading();
		ovr2 = new MethodOverloading();
		System.out.println(ovr1.sum(10, 15));
		System.out.println(ovr2.sum(10.5f, 15.8f));
	}

}
