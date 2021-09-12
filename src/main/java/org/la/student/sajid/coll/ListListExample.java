package org.la.student.sajid.coll;

import java.util.ArrayList;
import java.util.List;

public class ListListExample {
	public static void main(String[] args) {
		List<List<Character>> llc =new ArrayList<>();
		
		List<Character> lc1=new ArrayList<>();
		lc1.add('q');
		lc1.add('f');
		lc1.add('b');
		
		List<Character> lc2=new ArrayList<>();
		lc2.add('p');
		lc2.add('m');
		lc2.add('z');
		
		llc.add(lc1);
		llc.add(lc2);
		
		for(List<Character> lc:llc) {
			for(Character c:lc) {
				System.out.println("value: "+c);
			}
		}
	}

}
