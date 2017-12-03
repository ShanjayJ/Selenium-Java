package com.vmetry.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTableImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> trmp = new Hashtable<Integer, String>();
		trmp.put(1, "Munish");
		trmp.put(3, "sankar");
		trmp.put(1, "Prabu");
		trmp.put(4, "Mano");
		trmp.put(5, "Apr");
		trmp.put(5, "Perumal");
		trmp.put(6, "sanjay");

		System.out.println("Keys and Values");
		System.out.println("----------------");
		for (Map.Entry<Integer, String> ent : trmp.entrySet()) {
			System.out.println(ent.getKey() + "        " + ent.getValue());

		}
		trmp.replace(6, "Arun");
		System.out.println("After removal");
		System.out.println("----------------");
		for (Map.Entry<Integer, String> ent : trmp.entrySet()) {
			System.out.println(ent.getKey() + "        " + ent.getValue());

		}

	}

}
