package org.la.student.noor.intrfc.impl;

import org.la.student.noor.intrfc.Star;

public class TinyStar {
	public static void main(String[] args) {

		Star star = () -> System.out.println("This is tiny star");
		star.size();
	}
}
