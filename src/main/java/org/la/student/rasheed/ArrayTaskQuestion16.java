package org.la.student.rasheed;

/*
 * wap to reverse an array
 */
public class ArrayTaskQuestion16 {

	public static void main(String[] args) {
		char a [] = {'4', '5', '6', '7'};
		char b[] = new char [a.length];
		
		int x = a.length;
		
		for (int i=0 ; i<a.length; i++) {
			b[i] = a [x-1-i];
			
		}
			for (char c : b) {
				System.out.println(c);
			}
		
		

	}

}
