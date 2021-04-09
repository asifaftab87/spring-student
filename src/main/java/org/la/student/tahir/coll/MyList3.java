package org.la.student.tahir.coll;

import java.util.ArrayList;
import java.util.List;

public class MyList3 {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<>();
		
		list.add(30);
		list.add(20);
		list.add(90);
		
		for( Integer i : list) {
			System.out.println(i);
		}
		
		
	}

}
