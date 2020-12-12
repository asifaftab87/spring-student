package org.la.student.asif.loop;

public class IncreaseStar {

	public static void main(String[] args) {
		
		for(int i=1 ; i<=8 ; i++) {
			
			for(int k=1 ; k<=i ; k++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
