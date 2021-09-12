package org.la.student.sajid.coll;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("prince", 1);
		map.put("mister", 2);
		map.put("hitler", 3);
		map.put("sajid", 1);
		map.put("saddaf", 2);

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println("name: " + m.getKey() + "  valur" + m.getValue());
		}

	}

}
