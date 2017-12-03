package com.vmetry.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> st = new LinkedHashSet<String>();
		st.add("Arun");
		st.add("Munish");
		st.add("Shanjay");
		st.add("Arun");
		st.add("Munish");
		st.add("Allan");
		st.add("sankar");
		st.add(null);
		st.add("Jeyakumar");
		st.add("sankar");
		st.add(null);

		Iterator<String> itr = st.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("------------------");
		System.out.println("Collections Size Before Removal:" + st.size());
		st.remove("Munish");
		st.remove(null);

		System.out.println("Collections Size After Removal:" + st.size());
		itr = st.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
