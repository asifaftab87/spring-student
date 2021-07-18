package org.la.student.asif.collectn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.print("key: "+entry.getKey());
			System.out.println("      value: "+entry.getValue());
		}
		
		System.out.println(map.containsKey("Two"));
		System.out.println("key: "+map.get("four"));
		System.out.println("key: "+map.get("one"));
		Set<String> keys = map.keySet();
		System.out.println("keys: "+keys);
		Collection<String> values = map.values();
		System.out.println("values: "+values);
	}
}
