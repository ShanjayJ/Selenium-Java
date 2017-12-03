package com.vmetry.collections;

import java.util.ArrayList;

public class ArrayListImp {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lst = new ArrayList();
		lst.add("Arun");
		lst.add("Munish");
		lst.add("Shanjay");
		lst.add("Arun");
		lst.add("Munish");
		lst.add("Allan");
		lst.add("sankar");
		lst.add(null);
		lst.add(27);
		lst.add(true);
		lst.add('S');
		lst.add(30000.00);
		lst.add(false);

		System.out.println(lst);

	}

}
