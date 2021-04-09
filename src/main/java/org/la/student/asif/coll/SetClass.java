package org.la.student.asif.coll;

import java.util.HashSet;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(11);
		s.add(1);
		s.add(2);
		
		System.out.println("size: "+s.size());
		for(Integer i : s) {
			System.out.println(i);
		}
	}
}
