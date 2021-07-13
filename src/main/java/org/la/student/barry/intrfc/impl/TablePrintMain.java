package org.la.student.barry.intrfc.impl;

import org.la.student.barry.intrfc.TablePrint;

public class TablePrintMain {
	
	public static void main(String[] args) {
		
		TablePrint tp = n -> {
			for(int i=0; i<=10; i++) {
				System.out.println(n+" * "+i+ " = "+n*i);
				
			}
		};
		tp.print(4);
	}

}
