package org.la.student.asif;

public class TernaryOpertor2 {

	public static void main(String[] args) {
		
		int x=21, y=4, z =32;
		
		int r = (x>y) ? (x>z ? x : z) : (y>z ? y : z) ;
		
		System.out.println("r: "+r);
		
	}
}
