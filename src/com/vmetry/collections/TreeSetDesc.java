package com.vmetry.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> st = new TreeSet<String>();
		Set<String> descSt = new TreeSet<String>();
		st.add("Arun");
		st.add("Munish");
		st.add("Shanjay");
		st.add("Arun");
		st.add("Munish");
		st.add("Allan");
		st.add("sankar");
		st.add("Jeyakumar");
		st.add("Sankar");

		System.out.println("Ascending:");
		Iterator<String> itr1 = st.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("------------------");
		descSt = st.descendingSet();

		System.out.println("Desending:");
		Iterator<String> itr2 = descSt.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());

		}

	}

}
