package org.la.student.tahir.coll;

import java.util.ArrayList;
import java.util.List;

public class ListList {

	public static void main(String[] args) {
	List<List<Character>> llc = new ArrayList<>();
	
	List<Character> llc1 = new ArrayList<>();
	
	llc1.add('a');
	llc1.add('b');
	llc1.add('c');
	llc1.add('d');
	
	List<Character> llc2 = new ArrayList<>();
	
	llc2.add('e');
	llc2.add('f');
	llc2.add('g');
	
	llc.add(llc1);
	llc.add(llc2);
	
	for(List<Character> l : llc) {
		
		for(Character c : l) {
			
			System.out.println(c);
		}
	}
	
	
	

	}

}
