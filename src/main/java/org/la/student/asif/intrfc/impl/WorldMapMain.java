package org.la.student.asif.intrfc.impl;

import org.la.student.asif.intrfc.WolrdMap;

public class WorldMapMain {

	public static void main(String[] args) {
		
		WolrdMap wm = (String n) -> System.out.println(n);
		
		wm.sketch("India");
		wm.sketch("Malaysia");
	}
}
