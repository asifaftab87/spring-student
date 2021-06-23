package org.la.student.rasheed.clas;


import org.la.student.rasheed.array.ArrayOperation;

public class ArrayMain {
	
	public static void main(String [] args) {
		

		ArrayOperation ao = new ArrayOperation();
		int c []  = ao.copy(new int [] {1, 2, 3, 4, -1, -2, -3, -22});
		ao.print(c);
		// Here when you try to print the object it will give the reference of the address
		System.out.println(ao);
	}

}
