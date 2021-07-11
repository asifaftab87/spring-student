package org.la.student.asif.intrfc.impl;

import org.la.student.asif.intrfc.Star;

public class TinyStar {

	public static void main(String[] args) {
		
		Star star = () -> System.out.println("This is tiny star");
		star.size();
	}
}
