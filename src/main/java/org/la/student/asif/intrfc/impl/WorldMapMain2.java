package org.la.student.asif.intrfc.impl;

import org.la.student.asif.intrfc.WolrdMap;

public class WorldMapMain2 {

	public static void main(String[] args) {
		
		WolrdMap wm = n -> System.out.println(n);
		
		wm.sketch("New Zeland");
		wm.sketch("Australia");
	}
}
