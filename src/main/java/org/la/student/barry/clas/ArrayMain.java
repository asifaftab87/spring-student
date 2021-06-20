package org.la.student.barry.clas;

import org.la.student.asif.array.ArrayOperation;

public class ArrayMain {

	public static void main(String[] args) {
		
		ArrayOperation ao= new ArrayOperation();
		int c[]=ao.copy(new int   [] {1,2,3,4, -2,-3,-22});
		ao.print(c);

	}

}
