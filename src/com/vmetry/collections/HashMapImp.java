package com.vmetry.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "Munish");
		mp.put(3, "sankar");
		mp.put(1, "Prabu");
		mp.put(7, "Mano");
		mp.put(5, null);
		mp.put(null, null);
		mp.put(5, "Perumal");
		mp.put(null, "Arun");
		mp.put(6, null);

		System.out.println("Keys and Values");
		System.out.println("----------------");
		for (Map.Entry<Integer, String> ent : mp.entrySet()) {
			System.out.println(ent.getKey() + "        " + ent.getValue());

		}
		mp.remove(6);
		System.out.println("After removal");
		for (Map.Entry<Integer, String> ent : mp.entrySet()) {
			System.out.println(ent.getKey() + "        " + ent.getValue());

		}

	}

}
