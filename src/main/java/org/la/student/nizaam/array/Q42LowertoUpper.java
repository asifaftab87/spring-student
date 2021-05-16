package org.la.student.nizaam.array;

import java.util.Arrays;

public class Q42LowertoUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 	42)	wap to convert an array of characters from lower case to upper case, e.g if arr[] = {'A', 'b', 'C'} 
		then after conversion final array should be arr[] = {'a', 'b', 'c'}
		 */
		
		char c[]= {'a','b','c'};
		char Uarr[] = new char[c.length];
		for(int i=0;i<c.length;i++) {
			Uarr[i]=Character.toUpperCase(c[i]);
		}
		System.out.println(Arrays.toString(Uarr));
		
	}

}
