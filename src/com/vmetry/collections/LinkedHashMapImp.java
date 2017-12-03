package com.vmetry.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> lkmp = new LinkedHashMap<Integer, String>();
		lkmp.put(1, "Munish");
		lkmp.put(3, "sankar");
		lkmp.put(1, "Prabu");
		lkmp.put(4, "Mano");
		lkmp.put(5, null);
		lkmp.put(null, null);
		lkmp.put(5, "Perumal");
		lkmp.put(null, "Arun");
		lkmp.put(6, null);

		System.out.println("Keys and Values");
		System.out.println("----------------");
		for (Map.Entry<Integer, String> ent : lkmp.entrySet()) {
			System.out.println(ent.getKey() + "        " + ent.getValue());

		}
		lkmp.remove(1 , "Prabu");
		System.out.println("After removal");
		System.out.println("----------------");
		for (Map.Entry<Integer, String> ent : lkmp.entrySet()) {
			System.out.println(ent.getKey() + "        " + ent.getValue());

		}

	}

}
