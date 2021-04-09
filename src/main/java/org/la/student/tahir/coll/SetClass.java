package org.la.student.tahir.coll;

import java.util.HashSet;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {

		Set<Integer> s = new HashSet<>();
		s.add(100);
		s.add(29);
		s.add(34);
		s.add(10);
		
		System.out.println(s.size());
		
		for(Integer i : s) {
			
			System.out.println(i);
		}
		
		

	}

}
