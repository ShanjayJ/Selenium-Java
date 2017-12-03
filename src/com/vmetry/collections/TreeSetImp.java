package com.vmetry.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> st = new TreeSet<String>();
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
		Iterator<String> itr = st.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("------------------");
		System.out.println("Collections Size Before Removal:" + st.size());
		st.remove("Munish");
	
		System.out.println("Collections Size After Removal:" + st.size());
		itr = st.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

	}

