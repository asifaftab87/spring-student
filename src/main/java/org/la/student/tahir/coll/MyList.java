package org.la.student.tahir.coll;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	public static void main(String[] args){
		
		List list = new ArrayList();
		list.add("Abba");
		list.add("Sadiq");
		list.add("Faruk");
		
		for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		
		System.out.println("The 3rd in the list: " +list.get(2));
		
		System.out.println(list.size());
		
		
	}
}
