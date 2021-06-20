package org.la.student.jamal.method;

public class PatternPrinting {
	
	/*create a class name PatternPrinting
		create these methods
			void increasingStar(int)
			void decreasingStar(int)
			void increasingStarWithSpace(int)
			void decreasingStarWithSpace(int)
			void pyramid(int)
			void reversePyramid(int)
			void diamond(int)
			void numRow(int)
			void numColumn(int)
	 * 
	 */

	public static void main(String[] args) {
		
		increasingStar(5);
		
		System.out.println("  ");
		decreasingStar(8);
		
		System.out.println(" ");
		increasingStarWithSpace(5);
		
		System.out.println(" ");
		decreasingStarWithSpace(7);
		
		System.out.println(" ");
		pyramid(5);
		
		System.out.println(" ");
		reversePyramid(6);
		
		

	}
	static void increasingStar(int a) {
	for(int i=0;i<=8;i++) {
		for(int j=0;j<=i;j++) {
			
		System.out.print("*");
		
		}
		System.out.println();
	}
	
	}
	
	static void decreasingStar(int b) {
		for(int i=8;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void increasingStarWithSpace(int c) {
		for(int i=0;i<=8;i++) {
			for(int j=0;j<=i;j++) {
				
			System.out.print("* ");
			
			}
			System.out.println();
		
		
		}
	}
	
	static void decreasingStarWithSpace(int a) {
		for(int i=8;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	static void pyramid(int a) {
		for(int i=0;i<8;i++) {
			for(int j=0;j<8-i;j++) {
				System.out.print(" ");
				
			}
			for( int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
	static void reversePyramid(int a) {
		for (int i=5;i>=1;--i) {
			for(int space=1;space<=8-i;++space) {
				System.out.print("  ");
			}
			for(int j=i;j<=2*i-1;++j) {
				System.out.print("* ");
			}
			for (int j=0;j<i-1;++j) {
				System.out.print("* ");
			}
			System.out.println();
		
			
		}
		
	}
	
	
	
	
	
	
}
