package org.la.student.tahir.method;

public class Printingpatterns {
	// Pattern Printing
	public static void main(String[] args) {
		
		int a=8;
		
	increasedstar(a);	
	increasedstarR(a);
	decreasedstar(a);
	decreasedstarR(a);
	}
	
	
	/*
	 for(int i=1; i<=x; i++){
	 
	  for(int k=1; k<=i; k++){
	  
	  system.out.print("*");
	  }
	  
	    system.out.print (" ");
	    
	    }
	  
	 * */
	
	
	
	
	
	
	
	
	static void increasedstar(int x ) {
		
		for(int i=1; i<=x; i++ ) {
			
			for(int k=1; k<=i; k++) {
				
				System.out.print("*");
			}
			
			System.out.println("p");
		}
		
	}
	
static void increasedstarR(int x ) {
		
		for(int i=1; i<=x; i++ ) {
			for(int s=1; s<=x-i;s++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		System.out.println(" 1");
		
	}

static void decreasedstar(int x ) {
	
	for(int i=1; i<=x; i++ ) {
		
		for(int k=1; k<=x-i; k++) {
			
			System.out.print("*");
		}
		
		System.out.println(" ");
	}
	
}

static void decreasedstarR(int x ) {
	
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
