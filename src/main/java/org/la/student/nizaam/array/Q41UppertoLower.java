package org.la.student.nizaam.array;

import java.util.Arrays;

public class Q41UppertoLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 	41) wap to convert an array of characters from upper case to lower case, e.g if arr[] = {'a', 'b', 'C'} 
		then after conversion final array should be arr[] = {'A', 'B', 'C'}
		
		 */
		char c[]= {'A','B','C'};
		char Larr[] = new char[c.length];
		for(int i=0;i<c.length;i++) {
			Larr[i]=Character.toLowerCase(c[i]);
		}
		System.out.println(Arrays.toString(Larr));
		
		
	}

}
