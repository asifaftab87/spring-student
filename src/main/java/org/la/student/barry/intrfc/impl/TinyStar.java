package org.la.student.barry.intrfc.impl;

import org.la.student.barry.intrfc.Star;

public class TinyStar {
	public static void main(String[] args) {
		
		Star star = () -> System.out.println("This is tiny star");
		star.size();
	}

}
