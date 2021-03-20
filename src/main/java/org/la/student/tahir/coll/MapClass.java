package org.la.student.tahir.coll;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Musa",2);
		map.put("Yusuf", 3);
		map.put("Sans", 4);
		
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			
			System.out.println(m.getKey() + m.getValue());
			
		}
		
		

	}

}
