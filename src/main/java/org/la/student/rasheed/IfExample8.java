package org.la.student.rasheed;

public class IfExample8 {

	public static void main(String[] args) {
		
		
		
		char races = 'e';           //asian 
		char location ='m';
		
		System.out.println("program started for checking race");
		
		
		if ( (races=='b' || races=='e') && location=='m') {
			
			System.out.println("British");
		}
		
		if(races=='c' || races=='a' ) {
			
			System.out.println("Chinese Asian");
		}
		if(races=='a' && location=='m' ) {
			
			System.out.println("Arab");
		}
		
		System.out.println("races: "+races);

	}

}
