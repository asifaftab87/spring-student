package org.la.student.asif.coll;

import java.util.ArrayList;
import java.util.List;

public class ListListExample {

	
	public static void main(String[] args) {
		
		List<List<Character>> llC = new ArrayList<>();
		
		List<Character> lc1 = new ArrayList<>();
		lc1.add('q');
		lc1.add('r');
		lc1.add('s');
		
		List<Character> lc2 = new ArrayList<>();
		lc2.add('x');
		lc2.add('y');
		lc2.add('z');
		
		llC.add(lc1);
		llC.add(lc2);
		
		
		for(List<Character> lc : llC) {
			for(Character c : lc) {
				System.out.println("value: "+c);
			}
		}
		
		
	}
}
