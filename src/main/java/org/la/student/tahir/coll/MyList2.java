package org.la.student.tahir.coll;

import java.util.ArrayList;
import java.util.List;

public class MyList2 {

	public static void main(String[] args) {
		
		List list = new ArrayList<>();
		
		list.add(100);
		list.add(20);
		list.add(90.8f); // values to be added should be homogeneous **
		list.add(12);
		list.add(10);
		
		for(int i=0; i<list.size(); i++) {
			int j = (int)list.get(i);
		System.out.println(j);
		}
		
		

	}

}
