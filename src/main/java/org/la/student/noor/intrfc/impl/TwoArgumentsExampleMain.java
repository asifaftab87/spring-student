package org.la.student.noor.intrfc.impl;

import org.la.student.noor.intrfc.TwoArgumentsExample;

public class TwoArgumentsExampleMain {
	public static void main(String[] args) {

		TwoArgumentsExample tae = (s, i) -> {
			System.out.println("s: "+s+"\ni: "+i);
		};
		tae.print("noor", "shaikh");
	}
}
