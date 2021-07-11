package org.la.student.asif.intrfc.impl;

import org.la.student.asif.intrfc.TwoArgumentsExample;

public class TwoArgumentsExampleMain {

	public static void main(String[] args) {
		
		TwoArgumentsExample tae = (s, i) -> {
			System.out.println("s: "+s+"\ni: "+i);
		};
		tae.print("asif", "jawed");
	}
}
