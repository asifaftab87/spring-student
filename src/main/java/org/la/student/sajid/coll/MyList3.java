package org.la.student.sajid.coll;

import java.util.ArrayList;
import java.util.List;

public class MyList3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(45);
		list.add(55);
		list.add(23);

		for (int k = 0; k < list.size(); k++) {
			int j = list.get(k);
			System.out.println("j: " + j);
		}

		for (Integer i : list) {
			System.out.println(i);
		}
	}

}
