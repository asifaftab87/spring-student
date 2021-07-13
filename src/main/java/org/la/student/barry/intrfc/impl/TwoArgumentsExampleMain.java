package org.la.student.barry.intrfc.impl;

import org.la.student.barry.intrfc.TwoArgumentsExample;

public class TwoArgumentsExampleMain {

	public static void main(String[] args) {

		TwoArgumentsExample tae = (s , i ) -> {
			System.out.println("s:  "+s+ "\ni:  "+i);
		
		};
		tae.print("Aissatou", "Diarraye");

	}

}
