package org.la.student.asif.intrfc.impl;

import org.la.student.asif.intrfc.TablePrint;

public class TablePrintMain {

	public static void main(String[] args) {
		
		TablePrint tp = n -> {
			for(int i=1 ; i<=10 ; i++) {
				System.out.println(n+" * "+i+" = "+(n*i));
			}
		};
		tp.print(3);
	}
}
