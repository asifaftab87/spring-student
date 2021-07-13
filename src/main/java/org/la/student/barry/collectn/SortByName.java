package org.la.student.barry.collectn;

import java.util.Comparator;

public class SortByName implements Comparator<Node>{

	@Override
	public int compare(Node o1, Node o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
	

}
