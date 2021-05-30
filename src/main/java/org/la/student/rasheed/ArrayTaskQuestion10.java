package org.la.student.rasheed;

/*
 * wap to print array in reverse order
 */

public class ArrayTaskQuestion10 {

	public static void main(String[] args) {
		
		char src [] = {'g', 'd', '2', '$'};
		char tar [] = new char [src.length];
		
		int q = src.length;
		
		for (int i=0; i<src.length; i++) {
			tar[i] = src[q-1-i];
			
			
		}
		for (char d : tar) {
			System.out.println(d);
		}

	}

}
