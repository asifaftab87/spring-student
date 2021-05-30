package org.la.student.rasheed;

public class CopyArrayReverseOrder {
	/*
	 * wap to print array in reverse order
	 */

	public static void main(String[] args) {
		
		char src [] = {'q', '2', '%', '-'};
		char tar [] = new char [src.length];
		
		int l =src.length;
		
		for (int i=0; i<src.length; i++) {
			tar[i] = src[l-1-i];
		}
		for (char c :tar) {
			System.out.println(c);
		}
		
		

	}

}
