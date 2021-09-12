package org.la.student.tahir.method;

public class PrintingPatterns1 {

	public static void main(String[] args) {
		
		int a =5;
		increasedStar(a);
		increasedStarRight(a);
		decreasedStar(a);
		decreasedStarR(a);
		Diamond(a);

	}
	
	
	static void increasedStar( int x) {
		
		for(int i=1; i<=x; i++) {
			
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
			
			
			
		}
	}
	
	static void increasedStarRight( int x) {
		
		for(int i=1; i<=x; i++) {
			
			for( int s=1; s<=x-i; s++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
	}
	
	static void decreasedStar( int x) {
		System.out.println("");
		for(int i=1; i<=x; i++){
		
		for(int k=1; k<=x-i; k++) {
			System.out.print("*");
		}
		
		System.out.println(" ");


}
	}
	
	static void decreasedStarR( int x) {
		
		for(int i=1; i<=x; i++) {
			
			for(int s=1; s<=i; s++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=x-i; k++) {
				
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
	}
	
	static void Diamond( int x) {
		
		for(int i=-x; i<=x; i++) {
			
			int k=i;
			
			if (k<0)
			k=-k;
			
			for(int j = 0; j<=k; j++) {
				System.out.print(" ");
			}
			
			for(int j=k; j<=x; j++) {
				
				System.out.print("* ");
			}
			
			System.out.println("");
		}
	}
	
}