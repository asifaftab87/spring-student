package org.la.student.tahir.clas;

public class Printingpattern {
	
	public void IncreasedStar (int x) {
		
		for(int i=1; i<=x; i++) {
			
			for(int k=1; k<=i; k++) {
				
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
	}
	
public void decreasedStar (int x) {
		
		for(int i=1; i<=x; i++) {
			
			for(int k=1; k<=x-i; k++) {
				
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
	}

	public void increasedstarR(int x ) {
	
	for(int i=1; i<=x; i++ ) {
		for(int s=1; s<=x-i;s++) {
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++) {
			
			System.out.print("*");
		}
		
		System.out.println(" ");
	}
	
	}

	public void decreasedstarR(int x ) {
	
	for(int i=1; i<=x; i++ ) {
		for(int s=1; s<=i;s++) {
			System.out.print(" ");
		}
		for(int k=1; k<=x-i; k++) {
			
			System.out.print("*");
		}
		
		System.out.println(" ");
	}

	}
	
}
