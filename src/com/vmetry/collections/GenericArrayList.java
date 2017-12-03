package com.vmetry.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("Arun");
		lst.add("Munish");
		lst.add("Shanjay");
		lst.add("Arun");
		lst.add("Munish");
		lst.add("Allan");
		lst.add("sankar");
		lst.add(null);
		lst.add("Jeyakumar");
		lst.add("Sankar");
		lst.add(null);

		Iterator<String> itr = lst.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("------------------");
		System.out.println("Collections Size Before Removal:" + lst.size());
		lst.remove("Munish");
		System.out.println("Collections Size After Removal:" + lst.size());
		lst.remove(lst.size() - 1);
		lst.remove(0);

		itr = lst.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
