package org.la.student.asif.coll;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("asif", 2);
		map.put("taufeeq", 1);
		map.put("nawaz", 2);
		map.put("taufeeq", 11);
		map.put("aqsa", 2);
		
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println("name: "+m.getKey()+"    value: "+m.getValue());
		}
	}
}
