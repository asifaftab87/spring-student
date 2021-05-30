package org.la.student.rasheed;
/*
 * wap to copy an array to another array in reverse order
 */

public class ArrayTaskQuestion12 {

	public static void main(String[] args) {
		
	
		char a [] = {'v', '9', '&', '@'};
		char b [] = new char [a.length];
		
		int k =a.length;
		
		for (int i=0; i<a.length; i++) {
			b[i] = a[k-1-i];
		}
		for (char c :b) {
			System.out.println(c);

	}
		
}
}
