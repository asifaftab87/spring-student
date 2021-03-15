package org.la.student.asif.coll;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(33);
		list.add(4);
		list.add(32);
		list.add(1);
		
		int i = (int)list.get(0);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
	}
}
