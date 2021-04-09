package org.la.student.asif.coll;

import java.util.ArrayList;
import java.util.List;

public class MyList2 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(33);
		list.add(4.3f);			//dont add different data types in same array list
		list.add(32);
		list.add(1);
		
		int i = (int)list.get(0);
		float f = (float)list.get(1);
		
		for(int k=0 ; k<list.size() ; k++) {
			int j = (int)list.get(k);				//it will throw error
			System.out.println("j: "+j);
		}
	}
}
