package org.la.student.noor.intrfc.impl;

import org.la.student.noor.intrfc.WorldMap.WolrdMap;

public class WorldMapMain {

		public static void main(String[] args) {

			WolrdMap wm = (String n) -> System.out.println(n);

			wm.sketch("India");
			wm.sketch("Malaysia");
		}
}
