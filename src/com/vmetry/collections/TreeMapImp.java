package com.vmetry.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> trmp = new TreeMap<Integer, String>();
		trmp.put(1, "Munish");
		trmp.put(3, "sankar");
		trmp.put(1, "Prabu");
		trmp.put(4, "Mano");
		trmp.put(5, null);
		trmp.put(7, null);
		trmp.put(5, "Perumal");
		trmp.put(6, null);

		System.out.println("Keys and Values");
		System.out.println("----------------");
		for (Map.Entry<Integer, String> ent : trmp.entrySet()) {
			System.out.println(ent.getKey() + "        " + ent.getValue());

		}
		trmp.replace(6, "Arun");
		System.out.println();
		System.out.println("After removal");
		System.out.println("----------------");
		for (Map.Entry<Integer, String> ent : trmp.entrySet()) {
			System.out.println(ent.getKey() + "        " + ent.getValue());

		}

	}

}
